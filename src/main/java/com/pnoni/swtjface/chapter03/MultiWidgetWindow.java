package com.pnoni.swtjface.chapter03;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

/**
 * macOS의 경우 실행시 다음의 VM Option 추가 필요
 * -XstartOnFirstThread
 *
 * Created by julio on 2016. 7. 9..
 */
public class MultiWidgetWindow extends ApplicationWindow {

    public MultiWidgetWindow() {
        super(null);
    }

    @Override
    protected Control createContents(Composite parent) {
        TabFolder tabFolder = new TabFolder(parent, SWT.NONE);
        TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
        tabItem.setText("Chapter 3");
        tabItem.setControl(new MultiComposite(tabFolder));

        getShell().setText("Widget Window");
        return parent;
    }

    public static void main(String[] args) {
        MultiWidgetWindow widgetWindow = new MultiWidgetWindow();
        widgetWindow.setBlockOnOpen(true);
        widgetWindow.open();
        Display.getCurrent().dispose();
    }
}
