package org.bbaw.bts.ui.egy.textSign.support;

import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.core.commons.corpus.CorpusUtils;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAnnotation;
import org.bbaw.bts.corpus.btsCorpusModel.BTSLemmaCase;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import jsesh.mdc.MDCSyntaxError;
import jsesh.mdcDisplayer.draw.MDCDrawingFacade;
import jsesh.mdcDisplayer.preferences.DrawingSpecification;
import jsesh.mdcDisplayer.preferences.DrawingSpecificationsImplementation;


public abstract class ElementFiguresComposite extends Composite {
	
	protected static final Color COLOR_CANVAS_BACKGROUND = ColorConstants.white;

	protected static final Color COLOR_WORD_DESELECTED = ColorConstants.white;
	protected static final Color COLOR_WORD_SELECTED = ColorConstants.yellow;

	protected static final Color COLOR_MARKER_DESELECTED = BTSUIConstants.COLOR_BACKGROUND_DISABLED;
	protected static final Color COLOR_MARKER_SELECTED = ColorConstants.yellow;

	static final int MAX_IMAGE_SIZE = 200;

	protected Composite parentComposite;
	protected Map<String, IFigure> wordMap;
	protected List<Image> imageList = new Vector<Image>(1000);
	private DrawingSpecification drawingSpecifications = new DrawingSpecificationsImplementation();
	protected MouseListener elementSelectionListener;

	protected Integer showTransLangMask = 0;

	private Adapter notifier;
	protected boolean notifyWords = true;

	protected Map<String, List<BTSInterTextReference>> relatingObjectsMap;
	protected List<BTSObject> continuingRelatingObjects;
	protected HashMap<String, List<ElementFigure>> relatingObjectFigureMap;

	@Inject
	protected BTSTextEditorController textEditorController;

	@Inject
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_HIEROGLYPHS, nodePath = "org.bbaw.bts.ui.corpus.egy")
	protected Boolean showHieroglyphs;
	
	@Inject
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_FLEXION, nodePath = "org.bbaw.bts.ui.corpus.egy")
	protected Boolean showFlexion;
	
	@Inject
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_LEMMAID, nodePath = "org.bbaw.bts.ui.corpus.egy")
	protected Boolean showLemmaId;

	@Inject
	protected BTSResourceProvider resourceProvider;

	@Inject
	protected UISynchronize sync;


	public ElementFiguresComposite(Composite parent) {
		super(parent, SWT.NONE);
		this.parentComposite = parent;
		parent.setLayout(new FillLayout());
		this.setLayout(new FillLayout());
		notifier = makeNotifier();
		createEditor();
	}
	
	private Adapter makeNotifier() {
		return new Adapter() {

			@Override
			public void setTarget(Notifier newTarget) {
			}

			@Override
			public void notifyChanged(final Notification notification) {
				if (notifyWords) {
					System.out.println(" notifyChanged " + notification);
					sync.asyncExec(new Runnable()
					{
						public void run()
						{
							updateFigureFromWord(notification);
						}
					});
				}
			}

			@Override
			public boolean isAdapterForType(Object type) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Notifier getTarget() {
				// TODO Auto-generated method stub
				return null;
			}
		};		
	}
	
	protected abstract void createEditor();

	/**
	 * should add {@link #elementSelectionListener} as a mouse listener to the figure. 
	 */
	protected abstract void appendFigure(ElementFigure figure);

	protected abstract MouseListener elementSelectionListener();

	protected abstract void updateFigureFromWord(Notification notification);

	protected abstract void processReferences(ElementFigure itemFigure,
			List<BTSInterTextReference> list, BTSSentenceItem senItem);

	
	protected void updateRelatingObjectFigureMap(String relatingObjectID,
			ElementFigure itemFigure) {
		if (relatingObjectFigureMap == null)
		{
			relatingObjectFigureMap = new HashMap<String, List<ElementFigure>>();
		}
		List<ElementFigure> list = relatingObjectFigureMap.get(relatingObjectID);
		if (list == null)
		{
			list = new Vector<ElementFigure>(4);
			relatingObjectFigureMap.put(relatingObjectID, list);
		}
		if (!list.contains(itemFigure))
		{
			list.add(itemFigure);
		}
	}
	
	/**
	 * For a {@link BTSWord}, determine which background color is to be used for rendering an unselected {@link WordFigure},
	 * based on whether a Lemma Key is present for the given Word, i.e. whether the word has already been lemmatized. 
	 * @param word {@link BTSWord} object
	 * @return {@link BTSUIConstants#COLOR_LEMMA} if lemmatized, {@link #COLOR_WORD_DESELECTED} otherwise
	 */
	protected static Color colorWordDeselected(BTSWord word) {
		return (word.getLKey() != null && !word.getLKey().isEmpty()) ? 
				BTSUIConstants.COLOR_LEMMA : COLOR_WORD_DESELECTED;
	}

	protected BufferedImage getImageData(String topItemList)
			throws MDCSyntaxError {
		BufferedImage result;
		{
			MDCDrawingFacade facade = new MDCDrawingFacade();
			facade.setDrawingSpecifications(drawingSpecifications);
			facade.setMaxSize(5000, 45);
			facade.setCadratHeight(30);
			result = facade.createImage(topItemList);
		}
		return result;
	}

	protected Image transformToSWT(BufferedImage bufferedImage) {
		Image image = null;
		if (bufferedImage.getColorModel() instanceof DirectColorModel) {
			DirectColorModel colorModel = (DirectColorModel) bufferedImage
					.getColorModel();
			PaletteData palette = new PaletteData(colorModel.getRedMask(),
					colorModel.getGreenMask(), colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(),
					bufferedImage.getHeight(), colorModel.getPixelSize(),
					palette);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int rgb = bufferedImage.getRGB(x, y);
					int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF,
							(rgb >> 8) & 0xFF, rgb & 0xFF));
					data.setPixel(x, y, pixel);
					if (colorModel.hasAlpha()) {
						data.setAlpha(x, y, (rgb >> 24) & 0xFF);
					}
				}
			}
			image = new Image(Display.getCurrent(), data);
		} else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
			IndexColorModel colorModel = (IndexColorModel) bufferedImage
					.getColorModel();
			int size = colorModel.getMapSize();
			byte[] reds = new byte[size];
			byte[] greens = new byte[size];
			byte[] blues = new byte[size];
			colorModel.getReds(reds);
			colorModel.getGreens(greens);
			colorModel.getBlues(blues);
			RGB[] rgbs = new RGB[size];
			for (int i = 0; i < rgbs.length; i++) {
				rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF,
						blues[i] & 0xFF);
			}
			PaletteData palette = new PaletteData(rgbs);
			ImageData data = new ImageData(bufferedImage.getWidth(),
					bufferedImage.getHeight(), colorModel.getPixelSize(),
					palette);
			data.transparentPixel = colorModel.getTransparentPixel();
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					data.setPixel(x, y, pixelArray[0]);
				}
			}
			image = new Image(Display.getCurrent(), data);
		}
		imageList .add(image);
		return image;
	}


	protected void addLKeyToWordFigure(BTSWord word, WordFigure wordfigure) {
		// FIXME load lemma object and show lemma transliteration
		TypedLabel l = new TypedLabel();
		l.setType(TypedLabel.LEMMA);
		if (word.getLKey() != null && !"".equals(word.getLKey())) {
			l.setText(word.getLKey());
			l.setIcon(resourceProvider.getImage(Display.getCurrent(),
					BTSResourceProvider.IMG_LEMMA));
		}
		wordfigure.add(l);
	}

	protected void addTransToWordFigure(BTSWord word, WordFigure rect,
			String language) {
		// XXX shouldn't this be a wordfigure method
		TypedLabel l = new TypedLabel();
		l.setTranslationLang(language);
		if (word.getTranslation() != null) {
			String trans = word.getTranslation().getTranslationStrict(language);
			if (trans != null && !"".equals(trans)) {
				l.setText(language + ": " + trans);
			}
		}
		rect.add(l);
	}

	protected void addFCodeToWordFigure(BTSWord word, WordFigure rect) {
		// XXX shouldn't this be a wordfigure method
		TypedLabel l = new TypedLabel();
		l.setType(TypedLabel.FLEXION);
		if (word.getFlexCode() != null && !"".equals(word.getFlexCode())) {
			l.setText(word.getFlexCode());
			l.setIcon(
					resourceProvider.getImage(
							Display.getCurrent(),
							BTSResourceProvider.IMG_FLEXION
							)
					);
		}
		rect.add(l);
	}

	/** processes rubra and possible other annotations that concern styling of wordfigure.
	 * @param itemFigure
	 * @param relatingObject
	 */
	protected void processStylingAnnotations(ElementFigure itemFigure,
			BTSObject relatingObject) {
		if (relatingObject instanceof BTSAnnotation
				&& relatingObject.getType() != null
				&& relatingObject.getType().equals(CorpusUtils.ANNOTATION_RUBRUM_TYPE) 
				&& itemFigure instanceof WordFigure)
		{
			for (Object fig : itemFigure.getChildren()) {
				if (fig instanceof TypedLabel && ((TypedLabel)fig).getType() == TypedLabel.TRANSLITERATION) {
					 ((TypedLabel)fig).setForegroundColor(BTSUIConstants.COLOR_RUBRUM);
				}
			}
		}
	}

	protected ElementFigure makeWordFigure(BTSWord word) {
		TypedLabel label = new TypedLabel();
		label.setText(word.getWChar());
		label.setType(TypedLabel.TRANSLITERATION);

		final WordFigure rect = new WordFigure(label);
		rect.setBackgroundColor(colorWordDeselected(word));
		rect.setModelObject(word);
		rect.setType(ElementFigure.WORD);

		wordMap.put(word.get_id(), rect);
		// gridLayout = new GridLayout();
		// gridLayout.numColumns = 1;
		// gridLayout.makeColumnsEqualWidth = false;

		ToolbarLayout tl = new ToolbarLayout();
		tl.setHorizontal(false);
		tl.setSpacing(5);
		String mdc = textEditorController.transformWordToMdCString(word, -1);

		if (showHieroglyphs)
		{
		ImageFigure imageFigure = new CompartementImageFigure();
		// System.out.println("mdc " + mdc);
			
		if (mdc != null && !"".equals(mdc) && imageList.size() < MAX_IMAGE_SIZE)
		{
			try {
				Image image = transformToSWT(getImageData(mdc));
				//			String path = "E:/dev_resources/icons_48/save.png"; //$NON-NLS-1$
				//
				// image = new Image(Display.getDefault(), path);
				imageFigure.setImage(image);
			} catch (MDCSyntaxError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (mdc != null && !"".equals(mdc))
		{
			rect.setMdc(mdc);
		}
		// rect.getAttributesCompartment().add(imageFigure);
		rect.setImageFigure(imageFigure);
		rect.add(imageFigure);
		}

		if (showLemmaId)
		{
			// add lemma key
			addLKeyToWordFigure(word, rect);
		}
		
		if (showFlexion)
		{
			// add flexion code
			addFCodeToWordFigure(word, rect);
		}

		for (int i=0; i<BTSCoreConstants.LANGS.length; i++) {
			String lang = BTSCoreConstants.LANGS[i];
			if ((showTransLangMask >> i & 1) == 1) {
				addTransToWordFigure(word, rect, lang);
			}
		}
		rect.setSize(90, 290);
		rect.setLayoutManager(tl);

		if (!word.eAdapters().contains(notifier)) {
			word.eAdapters().add(notifier);
		}
		return rect;
	}

	
	/**
	 * Creates an {@link ElementFigure} instance representing the beginning or the end of an ambivalence
	 * @param ambivalence the {@link BTSAmbivalence} represented by the to-be-returned figure
	 * @param type either {@link ElementFigure#AMBIVALENCE_START} or {@link ElementFigure#AMBIVALENCE_END}
	 * @return
	 */
	protected static ElementFigure makeAmbivalenceBoundsFigure(BTSAmbivalence ambivalence, String type) {
		ElementFigure fig = new AmbivalenceBoundsFigure(type);
		fig.setModelObject(ambivalence);
		fig.setSize(15, 90);
		return fig;
	}

	
	private static ElementFigure makeCaseFigure(BTSLemmaCase lemmaCase) {
		MarkerFigure fig = new MarkerFigure("case");
		// add name
		if (lemmaCase.getName() != null && !"".equals(lemmaCase.getName())) {
			org.eclipse.draw2d.Label l = new org.eclipse.draw2d.Label();
			l.setText(lemmaCase.getName());
			fig.add(l);
		}
		fig.setType(ElementFigure.LEMMA_CASE);
		fig.setModelObject(lemmaCase);
		fig.setSize(15, 90);
		return fig;
	}


	/**
	 * Creates and configures a new {@link MarkerFigure} instance
	 * @param marker
	 * @return
	 */
	protected ElementFigure makeMarkerFigure(BTSMarker marker) {
		return MarkerFigure.create(marker);
	}
	
	protected void makeAmbivalenceFigures(BTSAmbivalence ambivalence) {

		appendFigure(
				makeAmbivalenceBoundsFigure(ambivalence, ElementFigure.AMBIVALENCE_START)
				);

		for (BTSLemmaCase lemmaCase : ambivalence.getCases()) {
			ElementFigure caseFigure = makeCaseFigure(lemmaCase);
			appendFigure(caseFigure);

			for (BTSAmbivalenceItem amItem : lemmaCase.getScenario()) {
				ElementFigure itemFigure = null;
				if (amItem instanceof BTSWord) {
					BTSWord word = (BTSWord) amItem;
					itemFigure = makeWordFigure(word);
					appendFigure(itemFigure);
				} else if (amItem instanceof BTSMarker) {
					BTSMarker marker = (BTSMarker) amItem;
					itemFigure = makeMarkerFigure(marker);
					appendFigure(itemFigure);
				}
				if (itemFigure != null && amItem instanceof BTSSentenceItem) {
					BTSSentenceItem  senItem = (BTSSentenceItem) amItem;

					if (relatingObjectsMap != null && relatingObjectsMap.containsKey(senItem.get_id()))
					{
						List<BTSInterTextReference> list = relatingObjectsMap.get(senItem.get_id());
						processReferences(itemFigure, list, senItem);
					}
					if (!continuingRelatingObjects.isEmpty())
					{
						for (BTSObject o : continuingRelatingObjects)
						{
							itemFigure.addRelatingObject(o);
							processStylingAnnotations(itemFigure, o);
							updateRelatingObjectFigureMap(o.get_id(), itemFigure);
						}
						//add continuing relating objects to figure!
					}
				// process relating Objects
				}
			}
		}

		appendFigure(
				makeAmbivalenceBoundsFigure(ambivalence, ElementFigure.AMBIVALENCE_END)
				);
	}

	/**
	 * Creates an {@link ElementFigure} instance representing the beginning or end of a sentence. 
	 * @param sentence
	 * @param type either {@link ElementFigure#SENTENCE_START} or {@link ElementFigure#SENTENCE_END}
	 * @return
	 */
	protected ElementFigure makeSentenceBoundsFigure(BTSSenctence sentence, String type) {
		MarkerFigure fig = new MarkerFigure(" § ");
		fig.setModelObject(sentence);
		fig.setType(type);
		fig.setSize(15, 90);
		return fig;
	}
}
