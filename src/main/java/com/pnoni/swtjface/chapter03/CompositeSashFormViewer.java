package com.pnoni.swtjface.chapter03;

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
public class CompositeSashFormViewer extends ApplicationWindow {

    public CompositeSashFormViewer() {
        super(null);
    }

    @Override
    protected Control createContents(Composite parent) {
        new CompositeSashForm(parent);
        return parent;
    }

    public static void main(String[] args) {
        CompositeSashFormViewer compositeViewer = new CompositeSashFormViewer();
        compositeViewer.setBlockOnOpen(true);
        compositeViewer.open();
        Display.getCurrent().dispose();
    }
}
