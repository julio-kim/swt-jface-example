package com.pnoni.swtjface.chapter04;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

/**
 * macOS의 경우 실행시 다음의 VM Option 추가 필요
 * -XstartOnFirstThread
 *
 * Created by julio on 2016. 7. 9..
 */
public class MouseKeyCompositeViewer extends ApplicationWindow {

    public MouseKeyCompositeViewer() {
        super(null);
    }

    @Override
    protected Control createContents(Composite parent) {
        new MouseKeyComposite(parent);
        return parent;
    }

    public static void main(String[] args) throws Exception {
        MouseKeyCompositeViewer mouseKeyCompositeViewer = new MouseKeyCompositeViewer();
        mouseKeyCompositeViewer.setBlockOnOpen(true);
        mouseKeyCompositeViewer.open();
        Display.getCurrent().dispose();
    }
}
