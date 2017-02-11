package mx.com.sidlors.testng;

import org.testng.annotations.Test;

public class DataProviderParametersAcceptanceExample {	
	
	@Test(dataProvider="TestType", dataProviderClass=DataProviderSource.class)
	public void acceptanceTest(String data) {
		System.out.println("Acceptance testing: Data(" + data + ")");
	}
}
