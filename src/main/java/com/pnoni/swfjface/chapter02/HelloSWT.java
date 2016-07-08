package com.pnoni.swfjface.chapter02;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * macOS의 경우 실행시 다음의 VM Option 추가 필요
 * -XstartOnFirstThread
 *
 * Created by julio on 2016. 7. 8..
 */
public class HelloSWT {
    public static void main(String[] args) {
        // 할당과 초기화
        Display display = new Display();
        Shell shell = new Shell(display);

        // 쉘에 위젯 추가하기
        Text helloText = new Text(shell, SWT.CENTER);
        helloText.setText("Hello SWT!!!");
        helloText.pack();

        // GUI 작동
        shell.pack();
        shell.open();
        while(!shell.isDisposed()) {
            if(!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}
