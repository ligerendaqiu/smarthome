/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschränkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/*
* generated by Xtext
*/
package org.eclipse.smarthome.model.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.smarthome.model.sitemap.Widget;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class SitemapLabelProvider extends DefaultEObjectLabelProvider {
	
	@Inject
	public SitemapLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(Widget widget) {
		String label = widget.getLabel();
		if(label==null) {
			label = widget.getItem();
		}
		return widget.eClass().getName() + " " + label==null? "" : label;
	}

    String image(Widget w) {
        return w.getClass().getSimpleName().replace("Impl", "").toLowerCase() + ".png";
    }
}