package com.pnoni.swtjface.chapter03;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * Created by julio on 2016. 7. 9..
 */
public class CompositeSashForm extends Composite {
    public CompositeSashForm(Composite parent) {
        super(parent, SWT.NONE);

        SashForm sashForm = new SashForm(this, SWT.VERTICAL);
        sashForm.setSize(120, 80);

        Button button1 = new Button(sashForm, SWT.ARROW | SWT.UP);
        button1.setSize(120, 40);

        Button button2 = new Button(sashForm, SWT.ARROW | SWT.DOWN);
        button2.setBounds(0, 40, 120, 40);
    }
}
