package testcasepage;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.MyHomePage;
import wdMethods.Annotations;

public class TC001_CreateLead extends Annotations {

	
	@BeforeTest
	public void setValue() {
			
			
		testCaseName = "TC003";
		testCaseDesc = "CreateLeadData";
		iteration="leads";
		author="Nithya";
		category="smoke";
		excelfile="CreateLead";
	}
		
		@Test(dataProvider="fetchdata")
		public void creatLead(String cName,String fName,String lName,String ExpectedResult) throws InterruptedException, IOException 
		{
			new MyHomePage()
			.clickLeads()
			.clickCreateLead()
			.companyName(cName)
			.firstName(fName)
			.lastName(lName)
			.clickSubmit()
			.verifyFName(ExpectedResult);
			
			
			
			
			
}



}