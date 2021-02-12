/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.sap.cec.secondweb.setup;

import static com.sap.cec.secondweb.constants.SecondwebConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.sap.cec.secondweb.constants.SecondwebConstants;
import com.sap.cec.secondweb.service.SecondwebService;


@SystemSetup(extension = SecondwebConstants.EXTENSIONNAME)
public class SecondwebSystemSetup
{
	private final SecondwebService secondwebService;

	public SecondwebSystemSetup(final SecondwebService secondwebService)
	{
		this.secondwebService = secondwebService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		secondwebService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return SecondwebSystemSetup.class.getResourceAsStream("/secondweb/sap-hybris-platform.png");
	}
}
