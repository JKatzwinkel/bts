package org.bbaw.bts.ui.egy.textSign.support;

import java.util.HashMap;
import java.util.Map;

import org.bbaw.bts.commons.BTSConstants;
import org.bbaw.bts.corpus.btsCorpusModel.BTSMarker;
import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;

public class MarkerFigure extends ElementFigureImpl {

	static final String VERS_FRONTER_MARKER = "\uDB80\uDC81"; //mv
	static final String VERS_BREAK_MARKER = "\uDB80\uDC80"; //v
	static final String BROKEN_VERS_MARKER = "\uDB80\uDC82";
	static final String DISPUTALBE_VERS_MARKER = "\u2E2E\uDB80\uDC80?";
	static final String DELETED_VERS_MARKER = "{\uDB80\uDC80}";
	static final String DESTROYED_VERS_MARKER = "[\uDB80\uDC80]";
	static final String MISSING_VERS_MARKER = "\u2329\uDB80\uDC80\u232A";

	@SuppressWarnings("serial")
	static final Map<String, String> LABELS = new HashMap<String, String>() {{
		put(BTSConstants.ANCIENTEXPANDEDMARKER, BTSConstants.ANCIENTEXPANDEDMARKER_SIGN);
		put(BTSConstants.BROKEN_VERS_MARKER, BROKEN_VERS_MARKER);
		put(BTSConstants.DELETEDDESTROYEDVERSMARKER, BTSConstants.DELETEDDESTROYEDVERSMARKER_SIGN);
		put(BTSConstants.DELETEDDISPUTABLEVERSMARKER, BTSConstants.DELETEDDISPUTABLEVERSMARKER_SIGN);
		put(BTSConstants.DELETEDVERSMARKER, BTSConstants.DELETEDVERSMARKER_SIGN);
		put(BTSConstants.DELETED_VERS_MARKER, DELETED_VERS_MARKER);
		put(BTSConstants.DESTROYEDDELETEDVERSMARKER, BTSConstants.DESTROYEDDELETEDVERSMARKER_SIGN);
		put(BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER, BTSConstants.DESTROYEDDISPUTABLEVERSFRONTIERMARKER_SIGN);
		put(BTSConstants.DESTROYEDVERSFRONTIERMARKER, BTSConstants.DESTROYEDVERSFRONTIERMARKER_SIGN);
		put(BTSConstants.DESTROYEDVERSMARKER, BTSConstants.DESTROYEDVERSMARKER_SIGN);
		put(BTSConstants.DESTROYED_VERS_MARKER, DESTROYED_VERS_MARKER);
		put(BTSConstants.DESTRUCTION_MARKER, "destruction");
		put(BTSConstants.DISPUTABLEDELETEDVERSMARKER, BTSConstants.DISPUTABLEDELETEDVERSMARKER_SIGN);
		put(BTSConstants.DISPUTABLEDESTROYEDVERSMARKER, BTSConstants.DISPUTABLEDESTROYEDVERSMARKER_SIGN);
		put(BTSConstants.DISPUTABLEVERSMARKER, BTSConstants.DISPUTABLEVERSMARKER_SIGN);
		put(BTSConstants.DISPUTABLE_VERS_MARKER, DISPUTALBE_VERS_MARKER);
		put(BTSConstants.EMENDATIONVERSMARKER, BTSConstants.EMENDATIONVERSMARKER_SIGN);
		put(BTSConstants.MISSINGDISPUTABLEVERSMARKER, BTSConstants.MISSINGDISPUTABLEVERSMARKER_SIGN);
		put(BTSConstants.MISSING_VERS_MARKER, MISSING_VERS_MARKER);
		put(BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER, BTSConstants.PARTIALDESTROYEDDELETEDVERSMARKER_SIGN);
		put(BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER, BTSConstants.PARTIALDESTROYEDDISPUTABLEVERSMARKER_SIGN);
		put(BTSConstants.PARTIALDESTROYEDVERSMARKER, BTSConstants.PARTIALDESTROYEDVERSMARKER_SIGN);
		put(BTSConstants.RASURMARKER, BTSConstants.RASURMARKER_SIGN);
		put(BTSConstants.RESTORATIONOVERRASURMARKER, BTSConstants.RESTORATIONOVERRASURMARKER_SIGN);
		put(BTSConstants.TEXT_VERS_BREAK_MARKER, VERS_BREAK_MARKER);
		put(BTSConstants.TEXT_VERS_FRONTIER_MARKER, VERS_FRONTER_MARKER);
	}};
	public static Color classColor = BTSUIConstants.COLOR_BACKGROUND_DISABLED;//new Color(null, 215, 115, 206);
	private String name;

	public MarkerFigure(String name) {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(classColor);
		setOpaque(true);
		org.eclipse.draw2d.Label label = new org.eclipse.draw2d.Label();
		label.setText(name);
		add(label);
		super.setCornerDimensions(new Dimension(0, 0));
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static MarkerFigure create(BTSMarker marker) {
		MarkerFigure fig = new MarkerFigure(
				LABELS.getOrDefault(marker.getType(), "##")
				);
		// add name
		if (marker.getName() != null && !"".equals(marker.getName())) {
			org.eclipse.draw2d.Label l = new org.eclipse.draw2d.Label();
			l.setText(marker.getName());
			fig.add(l);
		}
		fig.setType(ElementFigure.MARKER);
		fig.setModelObject(marker);
		fig.setSize(fig.calculateWidth(), 90);
		return fig;
	}
	

}
