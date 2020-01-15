/*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.android.provisioning;

import com.microsoft.appcenter.espresso.Factory;
import com.microsoft.appcenter.espresso.ReportHelper;
import com.microsoft.azure.sdk.iot.android.BuildConfig;
import com.microsoft.azure.sdk.iot.android.helper.TestGroup40;
import com.microsoft.azure.sdk.iot.common.helpers.Rerun;
import com.microsoft.azure.sdk.iot.common.tests.provisioning.ProvisioningServiceClientTests;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;


@TestGroup40
public class ProvisioningServiceClientAndroidRunner extends ProvisioningServiceClientTests
{
    @Rule
    public Rerun count = new Rerun(3);

    @Rule
    public ReportHelper reportHelper = Factory.getReportHelper();

    @BeforeClass
    public static void setup() throws Exception
    {
        provisioningServiceConnectionString = BuildConfig.DeviceProvisioningServiceConnectionString;
    }

    @After
    public void labelSnapshot()
    {
        reportHelper.label("Stopping App");
    }
}