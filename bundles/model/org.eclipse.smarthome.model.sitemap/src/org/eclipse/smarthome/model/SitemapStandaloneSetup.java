/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.model;


/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
public class SitemapStandaloneSetup extends SitemapStandaloneSetupGenerated {

    public static void doSetup() {
        new SitemapStandaloneSetup().createInjectorAndDoEMFRegistration();
    }
}