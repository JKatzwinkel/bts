package org.bbaw.bts.ui.egy.textSign;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.btsmodel.BTSInterTextReference;
import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BTSRelation;
import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.core.commons.BTSCoreConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSAmbivalence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSGraphic;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextItems;
import org.bbaw.bts.corpus.btsCorpusModel.BTSWord;
import org.bbaw.bts.searchModel.BTSModelUpdateNotification;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;
import org.bbaw.bts.ui.commons.corpus.interfaces.IBTSEditor;
import org.bbaw.bts.ui.commons.corpus.util.BTSEGYUIConstants;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.bbaw.bts.ui.egy.textSign.support.AmbivalenceBoundsFigure;
import org.bbaw.bts.ui.egy.textSign.support.ElementFigure;
import org.bbaw.bts.ui.egy.textSign.support.ElementFiguresComposite;
import org.bbaw.bts.ui.egy.textSign.support.LineFigure;
import org.bbaw.bts.ui.egy.textSign.support.MarkerFigure;
import org.bbaw.bts.ui.egy.textSign.support.TypedLabel;
import org.bbaw.bts.ui.egy.textSign.support.WordFigure;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.KeyEvent;
import org.eclipse.draw2d.KeyListener;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;

import jsesh.mdc.MDCSyntaxError;

public class SignTextComposite extends ElementFiguresComposite implements IBTSEditor {

	@Inject
	private IBTSEditor parentEditor;
	
	@Inject
	@Preference(nodePath = "org.bbaw.bts.ui.corpus.egy")
	IEclipsePreferences preferences;

	@Inject
	@Preference(value = BTSEGYUIConstants.SIGN_TEXT_SHOW_LINE_WIDTH, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Integer max_line_length;
	

	@Inject
	@Preference(value = BTSEGYUIConstants.PREF_LEMMATIZER_FELXION_DEFAULT, nodePath = "org.bbaw.bts.ui.corpus.egy")
	private Integer defaultFlexion;

	private ElementFigure selectedElement;

	private FlowLayout layout;
	private Figure container;
	protected int selectedIndex;
	private LineFigure currentLineFigure;
	private int lineIndex = 1;
	private Map<Integer, LineFigure> lineMap = new HashMap<>();
	private int cachedIndex;
	private MouseMotionListener mouseMotionListener;
	private KeyListener keyListener;
	private FigureCanvas canvas;
	private BTSTextContent textContent;
	private BTSObject btsObject;


	@Inject
	public SignTextComposite(Composite parent, IBTSEditor parentEditor) {
		super(parent);
		this.parentEditor = parentEditor;
	}


	/**
	 * (De)activates {@link BTSWord}-wise graphical update on model changes.
	 * BTWord objects currently on display in sign text editor get
	 * notified on changes in corresponding database objects. By default, such
	 * notifications lead to updates of the word's graphical representation.
	 * This can temporarily disabled when update is not desirable, e.g. before
	 * save operations. 
	 * @param value
	 */
	public void setNotifyWords(boolean value) {
		notifyWords = value;
	}

	protected void createEditor() {
		this.setLayout(new FillLayout());

		canvas = new FigureCanvas(this);
		// lightWeightSystem = new LightweightSystem(canvas);
		canvas.setData("org.eclipse.e4.ui.css.CssClassName", "SignTextCanvas");
		canvas.setBackground(COLOR_CANVAS_BACKGROUND);
		canvas.setLayout(new FillLayout());
		container = new Figure();
//		container.setBorder(new LineBorder());

		layout = new FlowLayout();
		layout.setHorizontal(false);
		layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorSpacing(3);
		container.setLayoutManager(layout);
		container.setBackgroundColor(COLOR_CANVAS_BACKGROUND);

		mouseMotionListener = new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent me) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseHover(MouseEvent me) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent me) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent me) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseDragged(MouseEvent me) {
				// TODO Auto-generated method stub
			}
		};
		keyListener = new KeyListener() {

			@Override
			public void keyReleased(KeyEvent ke) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.keycode == SWT.ARROW_RIGHT) {
					shiftSelection(1, true);
				}
				else if (ke.keycode == SWT.ARROW_LEFT) {
					shiftSelection(-1, false);
				} else if (ke.keycode == SWT.ARROW_DOWN) {
					shiftLineSelection(1);
				} else if (ke.keycode == SWT.ARROW_UP) {
					shiftLineSelection(-1);
				}
			}
		};
		container.setFocusTraversable(true);
		container.addMouseMotionListener(mouseMotionListener);
		container.addKeyListener(keyListener);

		canvas.setContents(container);
		
		this.layout();
		parentComposite.layout();

		max_line_length = canvas.getViewport().getBounds().width;

	}


	@Override
	public void addFocusListener(FocusListener listener) {
		super.addFocusListener(listener);
		canvas.addFocusListener(listener);
	}


	private void shiftLineSelection(int shift) {
		int newLineIndex = lineIndex + shift;
		newLineIndex = newLineIndex > -1 ? newLineIndex : 0;
		int currentIndex = 0;
		if (cachedIndex > 0) {
			currentIndex = cachedIndex;
		} else {
			currentIndex = currentLineFigure.getChildren().indexOf(
					selectedElement);
		}
		currentIndex = currentIndex > -1 ? currentIndex : 0;
		if (newLineIndex < container.getChildren().size()) {
			currentLineFigure = lineMap.get(newLineIndex);
			lineIndex = newLineIndex;
			if (currentIndex < currentLineFigure.getChildren().size()) {
//				ElementFigure figure = (ElementFigure) currentLineFigure
//						.getChildren().get(currentIndex);
				cachedIndex = -1;
				shiftSelection(currentIndex, true);

//				setSelectionInternal(figure);
			} else {
				cachedIndex = currentIndex;
				currentIndex = currentLineFigure.getChildren().size() - 1;
//				ElementFigure figure = (ElementFigure) currentLineFigure
//						.getChildren().get(currentIndex);
//				setSelectionInternal(figure);
				shiftSelection(currentIndex, true);

			}

		}

	}

	private void shiftSelection(int shift, boolean forward) {
		int currentIndex = currentLineFigure.getChildren().indexOf(
				selectedElement);
		int newIndex = currentIndex + shift;
		// Integer i = null;
		// System.out.println(i.toString());
		// System.out.println("currentIndex " + currentIndex + " shift " + shift
		// + " newIndex " + newIndex + " currentLine " + lineIndex);
		// check if current Selection at line end
		
		// refactored so that next figure is a WordFigure
		ElementFigure figure = findWordFigure(newIndex, forward);
		
		if (figure != null)
		{
			setSelectionInternal(figure);
		}
	}

	private ElementFigure findWordFigure(int newIndex, boolean forward) {
		ElementFigure figure = null;
		if (newIndex >= currentLineFigure.getChildren().size()) {
			if (lineIndex < container.getChildren().size() - 1) {
				lineIndex++;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = 0;
			}
		} else if (newIndex < 0) {
			if (lineIndex > 0) {
				lineIndex--;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = currentLineFigure.getChildren().size() - 1;
			} else if (lineIndex == 0)
			{
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = currentLineFigure.getChildren().size() - 1;
			}
		}
		figure = findElementFigure(newIndex);
		while (!(figure instanceof WordFigure))
		{
			if (forward)
			{
				newIndex = newIndex + 1;
			}
			else
			{
				newIndex = newIndex - 1;
			}
			if (newIndex >= currentLineFigure.getChildren().size()) {
				if (lineIndex < container.getChildren().size() - 1) {
					lineIndex++;
					currentLineFigure = lineMap.get(lineIndex);
					newIndex = 0;
				}
				else
				{
					break;
				}
			} else if (newIndex < 0) {
				if (lineIndex > 1) {
					lineIndex--;
					if (lineIndex < 1)break;
					currentLineFigure = lineMap.get(lineIndex);
					newIndex = currentLineFigure.getChildren().size() - 1;
				}
				else
				{
					break;
				}
			}
			else
			{
				currentLineFigure = lineMap.get(lineIndex);
			}
			figure = findElementFigure(newIndex);
			if (figure == null) break;
		}
		if (figure == null)
		{
			return null;
		}
		else if (figure instanceof WordFigure)
		{
			return figure;
		}
		else if (ElementFigure.SENTENCE_END.equals(figure.getType()) && lineIndex == lineMap.size() - 1)
		{
			// if it is the very last figure!
			return figure;
		}
		return null;
	}

	private ElementFigure findElementFigure(int newIndex) {
		ElementFigure figure = null;

//		if (newIndex >= currentLineFigure.getChildren().size()) {
//			if (lineIndex < container.getChildren().size() - 1) {
//				lineIndex++;
//				currentLineFigure = lineMap.get(lineIndex);
//				figure = (ElementFigure) currentLineFigure
//						.getChildren().get(0);
//			}
//		} else if (newIndex < 0) {
//			if (lineIndex > 0) {
//				lineIndex--;
//				currentLineFigure = lineMap.get(lineIndex);
//				newIndex = currentLineFigure.getChildren().size() - 1;
//				figure = (ElementFigure) currentLineFigure
//						.getChildren().get(newIndex);
//			}
//		} else {
//			figure = (ElementFigure) currentLineFigure
//					.getChildren()
//					.get(newIndex);
//			
//		}
		try {
			figure = (ElementFigure) currentLineFigure
					.getChildren()
					.get(newIndex);
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
		catch (IndexOutOfBoundsException e) {
			return null;
		}
		return figure;
	}

	protected MouseListener elementSelectionListener() {
		if (elementSelectionListener == null) {
			elementSelectionListener = new MouseListener() {
	
				@Override
				public void mousePressed(MouseEvent me) {
					if (me.getSource() instanceof ElementFigure) {
						ElementFigure figure = (ElementFigure) me.getSource();
						if (figure.getParent() instanceof LineFigure
								&& figure.getParent() != currentLineFigure) {
							lineIndex = container.getChildren().indexOf(
									figure.getParent());
						}
						setSelectionInternal(figure);
					}
				}
	
				@Override
				public void mouseReleased(MouseEvent me) {
				}
	
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
				}
	
			};
		}
		return elementSelectionListener;
	}


	protected void updateFigureFromWord(Notification notification) {
		BTSWord word = null;
		if (notification.getNotifier() instanceof BTSWord) {
			word = (BTSWord) notification.getNotifier();
		} else if (notification.getNotifier() instanceof BTSGraphic) {
			word = (BTSWord) ((BTSGraphic) notification.getNotifier())
					.eContainer();
		}
		if (word != null) {
			IFigure rect = (IFigure) wordMap.get(word.get_id());
			refreshFigureFromModel(rect, word);
		}
	}

	public void setInput(BTSObject btsObject, BTSTextContent textContent, List<BTSObject> relatingObjects,
			IProgressMonitor monitor, Object localSelectedTextItem) {
		this.textContent = textContent;
		this.btsObject = btsObject;
		this.relatingObjectsMap =  textEditorController
				.fillRelatingObjectsMap(relatingObjects);
		if (textContent != null) {
			loadText();
			this.layout();
			if (localSelectedTextItem != null && localSelectedTextItem instanceof BTSWord)
			{
				IFigure figure = wordMap.get(((BTSIdentifiableItem) localSelectedTextItem).get_id());
				if (figure != null && figure instanceof ElementFigure)
				{
					setSelectionInternal((ElementFigure) figure);
					reveal(figure);
				}
			}
		}
		else {
			purgeAll();
			this.layout();
			parentComposite.layout();
		}
	}


	private void loadText() {
		purgeAll();
		max_line_length = canvas.getViewport().getBounds().width;
		System.out.println("maximum line length: "+max_line_length);
		continuingRelatingObjects = new Vector<BTSObject>();
		// canvas = new FigureCanvas(this);
		// canvas.setBackground(COLOR_CANVAS_BACKGROUND);
		// canvas.setLayout(new FillLayout());
		container = new Figure();
		container.setBorder(new LineBorder());

		layout = new FlowLayout();
		layout.setHorizontal(false);
		layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorSpacing(3);
		container.setLayoutManager(layout);
		container.setBackgroundColor(COLOR_CANVAS_BACKGROUND);

		container.setFocusTraversable(true);
		container.addMouseMotionListener(mouseMotionListener);
		container.addKeyListener(keyListener);

		// initialize translation languages mask
		showTransLangMask = 0;
		for (int i=0; i < BTSCoreConstants.LANGS.length; i++) {
			String lang = BTSCoreConstants.LANGS[i];
			String prefVal = BTSEGYUIConstants.SIGN_TEXT_SHOW_TRANSLATION_PREF_PREFIX + lang;
			if (preferences.getBoolean(prefVal, false)) {
				showTransLangMask |= 1<<i;
			}
		}

		wordMap = new HashMap<String, IFigure>();
		for (BTSTextItems item : textContent.getTextItems()) {
			if (item instanceof BTSSenctence) {
				BTSSenctence sentence = (BTSSenctence) item;

				// insert start Sentence
				appendFigure(
						makeSentenceBoundsFigure(sentence, ElementFigure.SENTENCE_START)
						);
				for (BTSSentenceItem senItem : sentence.getSentenceItems()) {
					ElementFigure itemFigure = null;
					if (senItem instanceof BTSWord) {
						BTSWord word = (BTSWord) senItem;
						itemFigure = makeWordFigure(word);
						appendFigure(itemFigure);
					}
					else if (senItem instanceof BTSMarker) {
						BTSMarker marker = (BTSMarker) senItem;
						itemFigure = makeMarkerFigure(marker);
						appendFigure(itemFigure);
					}
					else if (senItem instanceof BTSAmbivalence) {
						BTSAmbivalence ambivalence = (BTSAmbivalence) senItem;
						makeAmbivalenceFigures(ambivalence);
					}
					
					if (itemFigure != null) {
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
				appendFigure(
						makeSentenceBoundsFigure(sentence, ElementFigure.SENTENCE_END)
						);

			}
		}
		lineIndex = 0;
		currentLineFigure = lineMap.get(lineIndex);
		// firstLine.add(cursor);
		// layout = new FlowLayout();
		// layout.setHorizontal(false);
		// layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
		// layout.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);
		// layout.setMinorSpacing(3);
		canvas.setContents(container);
		// container.setLayoutManager(layout);

		container.setFocusTraversable(true);
		this.layout();
		parentComposite.layout();
	}

	protected void processReferences(ElementFigure itemFigure,
			List<BTSInterTextReference> list, BTSSentenceItem senItem) {
			// FIXME ende einer annotation berechnen!!!!!!!!
			for (BTSInterTextReference ref : list)
			{
				BTSObject relatingObject = null;
				if (ref.eContainer() != null && ref.eContainer() instanceof BTSRelation && ref.eContainer().eContainer() != null)
				{
					relatingObject = (BTSObject) ref.eContainer().eContainer();
				}
				else
				{
					continue;
				}
				if (ref.getBeginId() == null || ref.getEndId() == null || ref.getBeginId().equals(ref.getEndId()))
				{
					//1) ref referenziert nur ein Item
					itemFigure.addRelatingObject(relatingObject);
					processStylingAnnotations(itemFigure, relatingObject);
					updateRelatingObjectFigureMap(relatingObject.get_id(), itemFigure);

				}
				else if (ref.getBeginId().equals(senItem.get_id())) {
				// 2) ref ist start
				// annotation erzeugen
					itemFigure.addRelatingObject(relatingObject);
					processStylingAnnotations(itemFigure, relatingObject);
					continuingRelatingObjects.add(relatingObject);
					updateRelatingObjectFigureMap(relatingObject.get_id(), itemFigure);
				// annotation und start position cachen
				
				}
				else if (ref.getEndId().equals(senItem.get_id())){
				// 3) ref ist end
				// annotation aus cache holen - wie?
					itemFigure.addRelatingObject(relatingObject);
					processStylingAnnotations(itemFigure, relatingObject);
					continuingRelatingObjects.remove(relatingObject);
					updateRelatingObjectFigureMap(relatingObject.get_id(), itemFigure);
				}
			}
		
	}


	private void purgeAll() {
		
		// dispose all images
		for (Image im : imageList)
			if (!im.isDisposed())
				im.dispose();
		imageList.clear();
		if (container != null) {
			container.removeAll();

		}
		container = null;
		// if (canvas != null) {
		// canvas.setContents(null);
		// canvas.dispose();
		// }
		// canvas = null;
		lineIndex = 0;
		cachedIndex = -1;
		if (wordMap != null) {
			wordMap.clear();
			lineMap.clear();
		}
		if (currentLineFigure != null) {
			currentLineFigure = null;
		}
		relatingObjectFigureMap = null;
	}


	protected void appendFigure(ElementFigure figure) {
		if (currentLineFigure == null) {
			currentLineFigure = makeLineFigure();
		}
		int len = figure.calculateWidth() + 2;
				
		if (figure.getType().equals(ElementFigure.SENTENCE_START)) {
			currentLineFigure = makeLineFigure();
		} else if (!(currentLineFigure.getSpaceLength() + len <= max_line_length)
				&& !figure.getType().equals(ElementFigure.SENTENCE_END)) {
			currentLineFigure = makeLineFigure();
		}
		currentLineFigure.add(figure);
		figure.addMouseListener(elementSelectionListener());
	}

	private LineFigure makeLineFigure() {
		LineFigure fig = new LineFigure();
		fig.setSize(400, 190);
		lineMap.put(lineIndex++, fig);
		container.add(fig);
		ToolbarLayout l = new ToolbarLayout();
		l.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		l.setStretchMinorAxis(false);
		l.setSpacing(2);
		l.setHorizontal(true);
		fig.setLayoutManager(l);
		return fig;
	}





	private void setDeselected(ElementFigure figure, int eventType) {
		if (figure != null) {
			if (figure instanceof WordFigure) {
				figure.setBackgroundColor(
						eventType == 1 ? BTSUIConstants.COLOR_LEMMA :  
						colorWordDeselected((BTSWord)figure.getModelObject()));
			} else if (figure instanceof MarkerFigure) {
				figure.setBackgroundColor(COLOR_MARKER_DESELECTED);
			}else if (figure instanceof AmbivalenceBoundsFigure) {
				figure.setBackgroundColor(BTSUIConstants.VIEW_FOREGROUND_DESELECTED_COLOR);
			}
			figure.repaint();
		}

	}


	private void setSelectionInternal(ElementFigure figure) {
		setSelectionInternal(figure, 0);
	}


	private void setSelectionInternal(ElementFigure figure, int eventType) {
		System.out.println("figure width: "+figure.calculateWidth());
		if (figure.getParent() instanceof LineFigure) {
			if (figure.getParent() != currentLineFigure) {
				currentLineFigure = (LineFigure) figure.getParent();
			}
		}
		if (figure != selectedElement) {
			ElementFigure oldSelection = selectedElement;
			setDeselected(oldSelection, eventType);
			selectedElement = figure;
			try {
				reveal(selectedElement);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		if (figure instanceof WordFigure) {
			// check if mdc image is loaded
			WordFigure wordFigure = (WordFigure)figure;
			if (wordFigure.getMdc() != null)
			{
				try {
					Image image = transformToSWT(getImageData(wordFigure.getMdc()));
					wordFigure.getImageFigure().setImage(image);
				} catch (MDCSyntaxError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wordFigure.setMdc(null);
			}
			figure.setBackgroundColor(COLOR_WORD_SELECTED);
		} else if (figure instanceof MarkerFigure) {
			figure.setBackgroundColor(COLOR_MARKER_SELECTED);
		}else if (figure instanceof AmbivalenceBoundsFigure) {
			figure.setBackgroundColor(COLOR_MARKER_SELECTED);
		}
		figure.repaint();
		// else if (figure instanceof WordFigure) {
		// figure.setBackgroundColor(COLOR_WORD_SELECTED);
		// }

		if (parentEditor != null) {
			
			Event e = new Event();
			e.widget = this;
			TypedEvent ev = new TypedEvent(e);
			BTSTextSelectionEvent event = new BTSTextSelectionEvent(ev, btsObject);
			event.type = eventType;
			event.data = textContent.eContainer();
			event.getRelatingObjects().addAll(((ElementFigure)figure).getRelatingObjects());
			BTSIdentifiableItem item = (BTSIdentifiableItem) figure.getModelObject();
			event.getSelectedItems().add(item);

			if (item instanceof BTSSentenceItem)
			{
				event.setEndId(item.get_id());
				event.setStartId(item.get_id());
			}
			
			event.getInterTextReferences().addAll(((ElementFigure)figure).getInterTextReferences());
			parentEditor.setEditorSelection(event);
		}
	}


	public void reveal(IFigure target) {
		Viewport port = canvas.getViewport();
		Rectangle exposeRegion = target.getBounds().getCopy();
		target = target.getParent();
		while (target != null && target != port) {
			target.translateToParent(exposeRegion);
			target = target.getParent();
		}
		exposeRegion.expand(5, 5);

		Dimension viewportSize = port.getClientArea().getSize();

		Point topLeft = exposeRegion.getTopLeft();
		Point bottomRight = exposeRegion.getBottomRight().translate(
				viewportSize.getNegated());
		Point finalLocation = new Point();
		if (viewportSize.width < exposeRegion.width)
			finalLocation.x = Math.min(bottomRight.x,
					Math.max(topLeft.x, port.getViewLocation().x));
		else
			finalLocation.x = Math.min(topLeft.x,
					Math.max(bottomRight.x, port.getViewLocation().x));

		if (viewportSize.height < exposeRegion.height)
			finalLocation.y = Math.min(bottomRight.y,
					Math.max(topLeft.y, port.getViewLocation().y));
		else
			finalLocation.y = Math.min(topLeft.y,
					Math.max(bottomRight.y, port.getViewLocation().y));

		canvas.scrollSmoothTo(finalLocation.x, finalLocation.y);
	}





	public void setTextSelectionEvent(String event) {
		int currentIndex = currentLineFigure.getChildren().indexOf(
				selectedElement);
		refreshFigureFromModel(selectedElement, null);
		if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_START)) {

			lineIndex = 0;
			shiftLineSelection(-1);
//			int currentIndex = currentLineFigure.getChildren().indexOf(
//					selectedElement);
			shiftSelection(-currentIndex, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_START)) {
//			int currentIndex = currentLineFigure.getChildren().indexOf(
//					selectedElement);
			shiftSelection(-currentIndex, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_PREVIOUS)) {
			shiftSelection(-1, false);

		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT)) {
			shiftSelection(1, true);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_LINE_END)) {
//			int currentIndex = currentLineFigure.getChildren().indexOf(
//					selectedElement);
			int shift = currentLineFigure.getChildren().size() - currentIndex
					- 1;
			shiftSelection(shift, false);
		} else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_ALL_END)) {
			int lshift = container.getChildren().size() - lineIndex - 1;
			shiftLineSelection(lshift);
			currentIndex = currentLineFigure.getChildren().indexOf(
					selectedElement);
//			int currentIndex = currentLineFigure.getChildren().indexOf(
//					selectedElement);
			int shift = currentLineFigure.getChildren().size() - currentIndex
					- 1;
			shiftSelection(shift, false);
		}
		else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT_UNLEMMATIZED)) {
			ElementFigure figure = findUnprocessedWordFigure(currentIndex +1, 0);
			if (figure != null)
				setSelectionInternal(figure, 1);
		}
		else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT_UNHIEROGLYPHED)) {
			ElementFigure figure = findUnprocessedWordFigure(currentIndex +1, 1);
			if (figure != null)
				setSelectionInternal(figure, 1);
		}
		else if (event.equals(BTSUIConstants.EVENT_TEXT_SELECTION_NEXT_UNFLEXIONED)) {
			ElementFigure figure = findUnprocessedWordFigure(currentIndex +1, 2);
			if (figure != null)
				setSelectionInternal(figure, 1);
		}
	}


	private ElementFigure findUnprocessedWordFigure(int newIndex, int type) {
		ElementFigure figure = null;
		if (newIndex >= currentLineFigure.getChildren().size()) {
			if (lineIndex < container.getChildren().size() - 1) {
				lineIndex++;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = 0;
			}
		} else if (newIndex < 0) {
			if (lineIndex > 0) {
				lineIndex--;
				currentLineFigure = lineMap.get(lineIndex);
				newIndex = currentLineFigure.getChildren().size() - 1;
			}
		}
		figure = findElementFigure(newIndex);
		while (!unprocessedWord(figure, type))
		{
			newIndex = newIndex + 1;
			if (newIndex >= currentLineFigure.getChildren().size()) {
				if (lineIndex < container.getChildren().size() - 1) {
					lineIndex++;
					currentLineFigure = lineMap.get(lineIndex);
					newIndex = 0;
				}
				else
				{
					break;
				}
			} else if (newIndex < 0) {
				if (lineIndex > 1) {
					lineIndex--;
					if (lineIndex < 1)break;
					currentLineFigure = lineMap.get(lineIndex);
					newIndex = currentLineFigure.getChildren().size() - 1;
				}
				else
				{
					break;
				}
			}
			else
			{
				currentLineFigure = lineMap.get(lineIndex);
			}
			figure = findElementFigure(newIndex);
			if (figure == null) break;
		}
		if (figure == null) return null;
		else if (figure instanceof WordFigure)
		{
			return figure;
		}
		else if (ElementFigure.SENTENCE_END.equals(figure.getType()) && lineIndex == lineMap.size() - 1)
		{
			// if it is the very last figure!
			return figure;
		}
		return null;
	}


	private boolean unprocessedWord(ElementFigure figure, int type ) {
		if (figure instanceof WordFigure)
		{
			Object o = ((WordFigure)figure).getModelObject();
			if (o instanceof BTSWord)
			{
				BTSWord w = (BTSWord) o;
				if (type == 0)
				{
					return (w.getLKey() == null || w.getLKey().trim().length() == 0);
				}
				else if (type == 1)
				{
					return (w.getGraphics() == null || w.getGraphics().isEmpty());
				}
				else if (type == 2)
				{
					if (w.getFlexCode() == null || w.getFlexCode().trim().length() == 0)
					{
						return true;
					}
					Integer i = null;
					try {
						i = new Integer(w.getFlexCode());
					} catch (NumberFormatException e) {
					}
					if (i != null && i.intValue() == defaultFlexion)
					{
						return true;
					}
					return false;
				}
			}
		}
		return false;
	}


	private void refreshFigureFromModel(IFigure figure, BTSWord word) {
		if (figure instanceof WordFigure)
		{
			WordFigure wf = (WordFigure) figure;
			Object o = wf.getModelObject();
			if (word == null && o instanceof BTSWord)
			{
				word = (BTSWord) o;
			}
			boolean lset = false;
			boolean fset = false;
			for (Object fig : wf.getChildren()) {
				if (fig instanceof ImageFigure) {
					ImageFigure imf = (ImageFigure) fig;
					String mdc = textEditorController.transformWordToMdCString(word, -1);
					try {
						if (imf.getImage() != null)
							if (!imf.getImage().isDisposed())
								imf.getImage().dispose();
						imf.setImage(transformToSWT(getImageData(mdc)));
					} catch (MDCSyntaxError e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (fig instanceof TypedLabel) {
					TypedLabel l = (TypedLabel) fig;
					switch (l.getType()) {
						case TypedLabel.LEMMA :
							l.setText(word.getLKey());
							lset = true;
							break;
						case TypedLabel.FLEXION :
							l.setText(word.getFlexCode());
							fset = true;
							break;
						case TypedLabel.TRANSLITERATION :
							l.setText(word.getWChar());
							break;
						case TypedLabel.TRANSLATION :
							if (word.getTranslation() != null) {
								String lang = l.getTranslationLang();
								String trans = word.getTranslation().getTranslationStrict(lang);
								l.setText(lang + ":" + (trans != null ? trans : ""));
							}
							break;
					}
				}
				
			}
			if (showLemmaId && !lset && word.getLKey() != null && !"".equals(word.getLKey()))
			{
				addLKeyToWordFigure(word, wf);
			}
			if (showFlexion && !fset && word.getFlexCode() != null && !"".equals(word.getFlexCode()))
			{
				addFCodeToWordFigure(word, wf);
			}
			//FIXME add hieroglyphs
		}
		
	}


	@Override
	public boolean setFocus() {

		// loadText();
		// canvas.layout();
		return true;
	}


	public void addRelatingObjectNotification(
			BTSModelUpdateNotification notification) {
		if (notification.getObject() instanceof BTSObject && relatingObjectFigureMap != null)
		{
			BTSObject object = (BTSObject) notification.getObject();
			List<ElementFigure> figures = relatingObjectFigureMap.get(object.get_id());
			// remove old annotations
			if (figures != null) {
				for (ElementFigure fig : figures)
				{
					fig.getRelatingObjects().remove(object);
				}
			}
			if (BTSConstants.OBJECT_STATE_TERMINATED.equals(object.getState()))
			{
				// remove, do nothing
			}
			else
			{	
			// relObject ist neu
				for (BTSRelation rel : object.getRelations()) {
					if (rel.getObjectId() != null
							&& rel.getObjectId().equals(btsObject.get_id())) {
						for (BTSInterTextReference ref : rel.getParts()) {
								if (ref.getBeginId() != null)  {
									ElementFigure fig = (ElementFigure) wordMap.get(ref.getBeginId());
									if (fig == null) continue;
									fig.addRelatingObject(object);
									processStylingAnnotations(fig, object);
									updateRelatingObjectFigureMap(object.get_id(), fig);
									
									// TODO add relating object to all figures between begin and end figure!
									if (ref.getEndId() != null && ! ref.getEndId().equals(ref.getBeginId()))  {
										ElementFigure figEnd = (ElementFigure) wordMap.get(ref.getEndId());
										if (figEnd != null) {
											figEnd.addRelatingObject(object);
											processStylingAnnotations(fig, object);
											updateRelatingObjectFigureMap(object.get_id(), figEnd);
										}
									} 
								} 
						}
					}
				}
			}
		}
	}


	public void clearContent() {
		canvas.redraw();
	}


	@Override
	public void setEditorSelection(Object selection) {
		// TODO Auto-generated method stub
		
	}

}
