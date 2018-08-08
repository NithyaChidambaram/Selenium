package testcasepage;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.MyHomePage;
import wdMethods.Annotations;

public class TC002_CreateLeadNeg extends Annotations {

	
	@BeforeTest
	public void setValue() {
			
			
		testCaseName = "neg";
		testCaseDesc = "CreateLeadNegavtive";
		iteration="leads";
		author="Nithya";
		category="smoke";
		excelfile="CreateLead1";
	}
		
		@Test(dataProvider="fetchdata")
		public void creatLead(String cName,String fName,String lName,String ExpectedRes) throws InterruptedException, IOException 
		{
			new MyHomePage()
			.clickLeads()
			.clickCreateLead()
			.companyName(cName)
			.firstName(fName)
			.lastName(lName)
			.clickSubmitErrMsg()
			.verifyErrMsg(ExpectedRes);
			
			
			
			
			
			
			
}



}