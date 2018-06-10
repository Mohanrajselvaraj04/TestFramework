package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;


public class TC003_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataWorkbookName="TC001";
		sheetName="Createlead";
	}
	
	@Test(dataProvider="fetchData")	
	public void createlead(String uName,String pwd,String companyName,String firstName ,String lName) {
		
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogIn()
	.clickCrmSfa()
	.clickLeads()
	.clickCreateLead()
	.enterCompanyName(companyName)
	.enterFirstName(firstName)
	.enterLastName(lName)
	.clickCreateLead()
	.verifyFirstNameInViewLead(firstName);
	
	
	
		
	}
}

//public void createLead(String companyname,String firstname,String lastname) {