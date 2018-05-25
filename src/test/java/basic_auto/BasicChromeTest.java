package basic_auto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 6/7/17 21:13.
 */
public class BasicChromeTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
    }

    @Test
    public void TestCase1() {

        driver.findElement(By.id("name_3_firstname")).sendKeys("Tom");
        driver.findElement(By.id("name_3_lastname")).sendKeys("Tran");

        driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//input[@value='dance']")).click();

        Select dCountry = new Select(driver.findElement(By.id("dropdown_7")));
        dCountry.selectByIndex(3);

        Select dMonth = new Select(driver.findElement(By.id("mm_date_8")));
        dCountry.selectByIndex(3);

        Select dDay = new Select(driver.findElement(By.id("dd_date_8")));
        dCountry.selectByIndex(3);

        Select dYear = new Select(driver.findElement(By.id("yy_date_8")));
        dCountry.selectByIndex(3);

        driver.findElement(By.id("phone_9")).sendKeys("01234987456");
        driver.findElement(By.id("username")).sendKeys("TomTran");
        driver.findElement(By.id("email_1")).sendKeys("Tom123@gmail.com");

        String filePath = System.getProperty("user.dir") + "/src/test/resources/java-logo.png";
        driver.findElement(By.id("profile_pic_10")).sendKeys(filePath);

        driver.findElement(By.id("password_2")).sendKeys("123456789");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("123456789");

        driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input")).click();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
