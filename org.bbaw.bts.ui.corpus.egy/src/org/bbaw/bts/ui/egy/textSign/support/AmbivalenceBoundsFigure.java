package org.bbaw.bts.ui.egy.textSign.support;

import java.util.HashMap;
import java.util.Map;

import org.bbaw.bts.ui.commons.utils.BTSUIConstants;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;

public class AmbivalenceBoundsFigure extends ElementFigureImpl {

	public static Color classColor = BTSUIConstants.VIEW_FOREGROUND_DESELECTED_COLOR;//new Color(null, 215, 15, 206);

	@SuppressWarnings("serial")
	static final Map<String, String> LABELS = new HashMap<String, String>() {{
		put(ElementFigure.AMBIVALENCE_START, "Start");
		put(ElementFigure.AMBIVALENCE_END, "End");
	}};

	public AmbivalenceBoundsFigure(String type) {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, 1));
		setBackgroundColor(classColor);
		setOpaque(true);
		add(new Label("Am"));
		add(new Label(LABELS.get(type)));
		setType(type);
	}
}
