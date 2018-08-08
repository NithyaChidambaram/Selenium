package testcasepage;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.MyHomePage;
import wdMethods.Annotations;

public class TC004_EditLead extends Annotations {

	
	@BeforeTest
	public void setValue() {
			
			
		testCaseName = "TC004_EditLead";
		testCaseDesc = "Edit LeadData";
		iteration="leads";
		author="Nithya";
		category="smoke";
		excelfile="EditLead";
	}
	
	
	@Test(dataProvider="fetchdata")
	public void editLead(String firstName,String tit,String companyName,String changeN) throws InterruptedException, IOException {
		
		new MyHomePage()
		.clickLeads()
		.clickFindLead()
		.typeFirstName(firstName)
		.clickButton()
	     .clickeFirstLead()
	     //.verifyTitle(tit)
	     .clickEdit()
	     .editCompanyName(companyName)
	     .clickUpdate()
	     .verifyCompanyName(changeN);
	     
	     
	     
	}
}
