package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _01_TestNG_TestAnnotation {
WebDriver driver;
    @BeforeMethod
    public void test1() {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitos\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();

        driver.get("https://techno.study/");



        // each test should have at least 1 Assertion (Validation)





    }

    @Test
    public void test2() {

        String expectedURL = "https://techno.study/sdet";




        WebElement sdetCourseButton = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseButton.click();

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();
    }

    @Test
    public void test3() {

        String expectedURL = "https://techno.study/aboutus";



        WebElement aboutUsButton = driver.findElement(By.xpath("//a[text()='About Us']"));
        aboutUsButton.click();

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();

    }


}



















