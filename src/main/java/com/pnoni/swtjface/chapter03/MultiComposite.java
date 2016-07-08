package com.pnoni.swtjface.chapter03;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * Created by julio on 2016. 7. 9..
 */
public class MultiComposite extends Composite {

    public MultiComposite(Composite parent) {
        super(parent, SWT.NONE);
        parent.getShell().setText("Chapter 3 Composite");

        CompositeGroup compositeGroup = new CompositeGroup(this);
        compositeGroup.setLocation(0, 0);
        compositeGroup.pack();

        CompositeSashForm compositeSashForm = new CompositeSashForm(this);
        compositeSashForm.setLocation(140, 25);
        compositeSashForm.pack();

        pack();
    }
}
