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
//public class LoginSteps {
//
//    public static RemoteWebDriver driver;
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
//}
