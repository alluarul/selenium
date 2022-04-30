import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class amazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\korni\\IdeaProjects\\Selenium\\Drivers\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        WebElement mobileslink= driver.findElement(By.xpath("//a[text()='Mobiles']"));
        mobileslink.click();
        driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
        driver.findElement(By.xpath("//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-1\"]//h2//span")).click();
        //driver.findElement(By.xpath("//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-2\"]//h2//span")).click();
        //int a[]={10,20,30,};
        //Set<String> allwindows=driver.getWindowHandles();
        //int count=allwindows.size();
        Thread.sleep(20000);
        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());
        int count1 = windows.size();
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();





    }
}
