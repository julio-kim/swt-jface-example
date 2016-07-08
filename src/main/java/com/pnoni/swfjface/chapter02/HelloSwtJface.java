package com.pnoni.swfjface.chapter02;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

/**
 * macOS의 경우 실행시 다음의 VM Option 추가 필요
 * -XstartOnFirstThread
 *
 * Created by julio on 2016. 7. 8..
 */
public class HelloSwtJface extends ApplicationWindow {

    public HelloSwtJface() {
        // 윈도우 할당
        super(null);
    }

    @Override
    protected Control createContents(Composite parent) {
        // 윈도우 보이기
        Text helloText = new Text(parent, SWT.CENTER);
        helloText.setText("Hello SWT & JFace!!!");
        parent.pack();
        return parent;
    }

    public static void main(String[] args) {
        // 윈도우 작동
        HelloSwtJface helloSwtJface = new HelloSwtJface();
        helloSwtJface.setBlockOnOpen(true);
        helloSwtJface.open();
        Display.getCurrent().dispose();
    }
}
