/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.pde.internal.ui.editor.toc.actions;

import org.eclipse.pde.internal.core.text.toc.TocAnchor;
import org.eclipse.pde.internal.ui.PDEUIMessages;
import org.eclipse.pde.internal.ui.util.PDELabelUtility;

/**
 * TocAddAnchorAction - implements the addition of an Anchor object
 * to a parent TOC object.
 */
public class TocAddAnchorAction extends TocAddObjectAction {

	public TocAddAnchorAction() {
		setText(PDEUIMessages.TocPage_TocAnchor);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	public void run() {
		if (fParentObject != null)
		{	//Create a new anchor
			TocAnchor anchor = 
				fParentObject.getModel().getFactory().createTocAnchor(); 
			//Generate the name of the anchor
			String name = PDELabelUtility.generateName(getChildNames(), PDEUIMessages.TocPage_TocAnchor);
			anchor.setFieldAnchorId(name);
			//Add the new anchor to the parent TOC object
			addChild(anchor);
		}
	}
}
