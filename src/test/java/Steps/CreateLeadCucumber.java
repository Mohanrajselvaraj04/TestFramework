//package Steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//
//public class CreateLeadCucumber {
//
//  public static RemoteWebDriver driver;
//    
//    @Given("Invoke LeafTap application")
//    public void invokeApp() {
//        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("http://leaftaps.com/opentaps/");
//    }
//    
//    @And("Enter the username as (.*)")
//    public void enterUserName(String uName) {
//        driver.findElementById("username").sendKeys(uName);
//    }
//    
//    @And("Enter the password as (.*)")
//    public void enterPasswordName(String password) {
//        driver.findElementById("password").sendKeys(password);
//    }
//    @And("click on login button")
//    public void clickLoginButton() {
//        driver.findElementByClassName("decorativeSubmit").click();
//    }
//    
//    @And("click crmsfa link")
//    public void clickCRMSFA() {
//        driver.findElementByLinkText("CRM/SFA").click();
//    }
//    
//    @And("click createLead")
//    public void clickCreateLead() {
//        driver.findElementByLinkText("Create Lead").click();
//    }
//    
//    @And("Enter companyName")
//    public void enterCompanyName(String name) {
//        driver.findElementById("createLeadForm_companyName").sendKeys(name);
//    }
//    
//    @And("Enter FirstName")
//    public void enterFirstName(String firstname) {
//        driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
//    }
//    
//    @And("Enter lastName")
//    public void enterLastName(String lastname) {
//        driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
//    }
//    
//    @And("createLeadbutton")
//    public void clickCreateLeadButton() {
//        driver.findElementByName("submitButton").click();
//    }
//    
//    
//    
//}
//
//    
//
