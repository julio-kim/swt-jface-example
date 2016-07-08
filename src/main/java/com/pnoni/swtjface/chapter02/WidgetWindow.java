package com.pnoni.swtjface.chapter02;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

/**
 * macOS의 경우 실행시 다음의 VM Option 추가 필요
 * -XstartOnFirstThread
 *
 * Created by julio on 2016. 7. 8..
 */
public class WidgetWindow extends ApplicationWindow {

    public WidgetWindow() {
        super(null);
    }

    @Override
    protected Control createContents(Composite parent) {
        getShell().setText("Widget Window");
        parent.setSize(400, 250);
        return parent;
    }

    public static void main(String[] args) {
        WidgetWindow widgetWindow = new WidgetWindow();
        widgetWindow.setBlockOnOpen(true);
        widgetWindow.open();
        Display.getCurrent().dispose();
    }
}
