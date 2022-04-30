package AccessModifiers2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public boolean openurl(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\korni\\IdeaProjects\\Selenium\\Drivers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement mobileslink= driver.findElement(By.xpath("//a[text()='Mobiles']"));
        boolean c=mobileslink.isDisplayed();
        System.out.println(c);
        return c;

    }

}
