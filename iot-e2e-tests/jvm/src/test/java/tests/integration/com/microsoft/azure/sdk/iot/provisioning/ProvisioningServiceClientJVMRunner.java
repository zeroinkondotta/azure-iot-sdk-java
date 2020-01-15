package tests.integration.com.microsoft.azure.sdk.iot.provisioning;

import com.microsoft.azure.sdk.iot.common.helpers.Tools;
import com.microsoft.azure.sdk.iot.common.tests.provisioning.ProvisioningServiceClientTests;
import org.junit.BeforeClass;

public class ProvisioningServiceClientJVMRunner extends ProvisioningServiceClientTests
{
    @BeforeClass
    public static void setup()
    {
        provisioningServiceConnectionString = Tools.retrieveEnvironmentVariableValue(DPS_CONNECTION_STRING_ENV_VAR_NAME);
    }
}
