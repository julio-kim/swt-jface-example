package com.pnoni.swtjface.chapter03;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

/**
 * macOS의 경우 실행시 다음의 VM Option 추가 필요
 * -XstartOnFirstThread
 *
 * Created by julio on 2016. 7. 8..
 */
public class CompositeGroup extends Composite {

    public CompositeGroup(Composite parent) {
        super(parent, SWT.NONE);

        Group group = new Group(this, SWT.SHADOW_ETCHED_IN);
        group.setText("Group Label");

        Label label = new Label(group, SWT.NONE);
        label.setText("Two buttons: ");
        label.setLocation(20, 20);
        label.pack();

        Button button1 = new Button(group, SWT.PUSH);
        button1.setText("Push Button");
        button1.setLocation(20, 45);
        button1.pack();

        Button button2 = new Button(group, SWT.CHECK);
        button2.setText("Check button");
        button2.setBounds(20, 75, 90, 30);

        group.pack();
    }
}
