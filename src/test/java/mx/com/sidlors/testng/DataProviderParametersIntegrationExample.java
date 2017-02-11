package mx.com.sidlors.testng;

import org.testng.annotations.Test;

public class DataProviderParametersIntegrationExample {	

	@Test(dataProvider="TestType", dataProviderClass=DataProviderSource.class)
	public void integrationTest(String data) {
		System.out.println("Integration testing: Data(" + data + ")");
	}
}
