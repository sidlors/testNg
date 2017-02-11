package mx.com.sidlors.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mx.com.sidlors.testng.Employee;

public class DataProviderParametersEmployeeExample {	
	
	@Test(dataProvider="employeeData")
	public void empTest(Employee employee) {
		System.out.println("Employee testing: Data(" + employee + ")");
	}	
	
	
	@DataProvider(name="employeeData") 
	public Object[][] getEmployeeData() {
		return new Object[][]{{new Employee("Joe")}, {new Employee("Sam")}};
	}
}
