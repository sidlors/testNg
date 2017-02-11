package mx.com.sidlors.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	@Parameters({"param1", "param2"})
	@Test	
	public void paramTest(int p1, String p2) {
		System.out.println("Parameter Example: Data(" + p1 + ", " + p2 + ")");
	}
}
