package mx.com.sidlors.testng;

import org.testng.annotations.Test;

public class StaticDataProviderExample {	
	
	@Test(dataProvider="client1", dataProviderClass=DataProviderSource.class)
	public void client1Test(Integer p) {
		System.out.println("Client1 testing: Data(" + p + ")");
	}	
	
	@Test(dataProvider="client2", dataProviderClass=DataProviderSource.class)
	public void client2Test(Integer p) {
		System.out.println("Client2 testing: Data(" + p + ")");
	}		
}
