package MethodsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;
    public void launchbrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\korni\\IdeaProjects\\Selenium\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }

    public MobilesPage clickOnMobilesLink(){


        WebElement mobileslink= driver.findElement(By.xpath("//a[text()='Mobiles']"));
        mobileslink.click();
        return new MobilesPage();
    }
}
