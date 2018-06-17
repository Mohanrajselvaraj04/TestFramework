package string;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
    WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.findElementById("txtStationFrom").clear();
        driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);

        driver.findElementById("txtStationTo").clear();
        driver.findElementById("txtStationTo").sendKeys("Bangalore Cant", Keys.TAB);

        boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
        
        if(selected) {
            driver.findElementById("chkSelectDateOnly").click();            
        }
        
 /*WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']/tbody");
        
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println(rows.size());
        WebElement row = rows.get(1);
        List<WebElement> cols = row.findElements(By.tagName("td"));
        WebElement secCol = cols.get(0);
        System.out.println(secCol.getText());
        secCol.findElements(By.tagName(tagName))*/

        List<WebElement> allcol = driver.findElementsByLinkText("Train");
        int size = allcol.size();
        for (int i = 1; i <= size; i++) {
            WebElement cols = allcol.get(i);
            System.out.println(cols.getText());
            
        }
    }

}
