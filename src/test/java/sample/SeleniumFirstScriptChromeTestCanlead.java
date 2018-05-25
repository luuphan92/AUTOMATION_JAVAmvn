package sample;

import complete_submit.Paused;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 4/4/17 19:48.
 */
public class SeleniumFirstScriptChromeTestCanlead {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dev.canlead.io");
    }

    @Test
    public void TestCase2() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/nav/a[2]")).click();
        Paused.time(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/button[1]")).click();
        Paused.time(2000);
        driver.findElement(By.name("email")).sendKeys("luuphan82@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/form/div[3]/div/button/div/div/span")).click();

        Paused.time(5000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/button/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[1]/div/span/span[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/article/div[1]/li/div/h3/span")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[2]/div/span/span[1]/input")).click();

        Paused.time(5000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/article/ul/div[2]/li/div[1]/h3/span")).click();
        Paused.time(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[3]/div/span/span[1]/input")).click();
        Paused.time(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/ul/div[2]/div/div/div/button/span[1]")).click();
        Paused.time(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/ul/div[2]/div/div[2]/ul/div[1]/div/span/span[1]/input")).click();
        Paused.time(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/button[2]/span[1]/span")).click();
        //upload images
        Paused.time(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[4]/div/span/span[1]/input")).click();
        driver.findElement(By.cssSelector("input[type=\"file\"]")).sendKeys("C:\\\\Users\\\\Luu Phan\\\\Desktop\\\\tesst\\\\1.jpg");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/button[1]/span[1]/span")).click();
        //add Description
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[5]/div/span/span[1]/input")).click();
        driver.findElement(By.name("title")).sendKeys("Test");
        driver.findElement(By.name("company")).sendKeys("Test");
        driver.findElement(By.name("organisationUnit")).sendKeys("Test");
        driver.findElement(By.name("department")).sendKeys("Test");
        driver.findElement(By.name("functionalUnit")).sendKeys("Test");
        driver.findElement(By.name("businessUnit")).sendKeys("Test");
        driver.findElement(By.name("hiringManager")).sendKeys("Test");
        driver.findElement(By.name("hrManager")).sendKeys("Test");
        driver.findElement(By.name("jobDescription")).sendKeys("Test");
        driver.findElement(By.name("employmentType")).sendKeys("Permanent Employee");
        driver.findElement(By.name("salaryFrom")).sendKeys("1000");
        driver.findElement(By.name("salaryTo")).sendKeys("2000");
        driver.findElement(By.name("bonus")).sendKeys("1000");
        driver.findElement(By.name("holiday")).sendKeys("12");
        driver.findElement(By.name("vacancies")).sendKeys("10");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/button[2]/span[1]/span")).click();
        //add Address
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[6]/div/span/span[1]/input")).click();
        Paused.time(5000);
        driver.findElement(By.id("googlemap-searchbox")).clear();
        driver.findElement(By.id("googlemap-searchbox")).sendKeys("436/59/40 Cách Mạng Tháng 8, phường 11, Quận 3, Hồ Chí Minh, Vietnam");
        Paused.time(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/button[2]/span[1]/span")).click();
        //add fee
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[7]/div/span/span[1]/input")).click();
        driver.findElement(By.name("currency")).sendKeys("USD");
        driver.findElement(By.name("maxFee")).sendKeys("1900");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/header/div/button[2]/span[1]/span")).click();
        //List your job
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/button/span[1]")).click();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
