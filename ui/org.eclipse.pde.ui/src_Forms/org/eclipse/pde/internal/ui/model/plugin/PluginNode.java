/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.pde.internal.ui.model.plugin;

import org.eclipse.core.runtime.*;
import org.eclipse.pde.core.plugin.*;

/**
 * @author melhem
 *
 */
public class PluginNode extends PluginBaseNode implements IPlugin {
	/* (non-Javadoc)
	 * @see org.eclipse.pde.core.plugin.IPlugin#getClassName()
	 */
	public String getClassName() {
		return getXMLAttributeValue(P_CLASS_NAME);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.pde.core.plugin.IPlugin#setClassName(java.lang.String)
	 */
	public void setClassName(String className) throws CoreException {
		setXMLAttribute(P_CLASS_NAME, className);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.model.plugin.PluginBaseNode#getSpecificAttributes()
	 */
	protected String[] getSpecificAttributes() {
		String classname = getClassName();
		if (classname != null && classname.trim().length() > 0)
			return new String[] {"   " + P_CLASS_NAME + "=\"" + classname + "\""}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return new String[0];
	}
	
}
