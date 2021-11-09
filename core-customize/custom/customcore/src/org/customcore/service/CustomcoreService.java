/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.customcore.service;

public interface CustomcoreService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
