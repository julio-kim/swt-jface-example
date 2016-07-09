package com.pnoni.swtjface.chapter04;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.*;

/**
 * Created by julio on 2016. 7. 9..
 */
public class MouseKeyComposite extends Composite {

    private Label output;

    public MouseKeyComposite(Composite parent) {
        super(parent, SWT.NONE);

        Text typed = new Text(this, SWT.NONE);
        typed.setText("Typed");
        typed.setLocation(5, 10);
        typed.pack();

        // 이벤트 타입을 Keyboard Event로 지정
        typed.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                keyHandler(keyEvent);
            }
        });

        Button untyped = new Button(this, SWT.PUSH);
        untyped.setText("Untyped");
        untyped.setLocation(5, 30);
        untyped.pack();

        // 이벤트 타입을 지정하지 않고 event.type으로 판단
        untyped.addListener(SWT.MouseEnter, UntypedListener);
        untyped.addListener(SWT.MouseExit, UntypedListener);

        output = new Label(this, SWT.SHADOW_OUT);
        output.setBounds(40, 70, 90, 40);
        output.setText("No Event");

        pack();
    }

    Listener UntypedListener = new Listener() {

        public void handleEvent(Event event) {
            switch (event.type) {
                case SWT.MouseEnter:
                    output.setText("Mouse Enter");
                    break;
                case SWT.MouseExit:
                    output.setText("Mouse Exit");
                    break;
            }
        }
    };

    private void keyHandler(KeyEvent keyEvent) {
        output.setText("Key Event: " + keyEvent.keyCode);
    }
}
