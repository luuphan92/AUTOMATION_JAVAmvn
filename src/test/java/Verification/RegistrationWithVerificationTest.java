package Verification;

import complete_submit.Paused;
import complete_submit.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 4/6/17 11:09.
 */
public class RegistrationWithVerificationTest {
    private WebDriver driver;
    private WebDriverWait wait;// xác nhận

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // timeout after 10s if expected condition does not meet
        wait = new WebDriverWait(driver, 10);
        driver.get("http://demoqa.com/registration/");
    }

    @Test
    public void TestCase1() {

        driver.findElement(By.name("first_name")).sendKeys(StringUtils.randomString(5));
        driver.findElement(By.name("last_name")).sendKeys(StringUtils.randomString(5));

        Paused.time(500);

        String[] maritalStatus = {"single","married","divorced"};
        driver.findElement(By.xpath(".//input[@value='" + StringUtils.randomItems(maritalStatus) + "']")).click();

        String[] hooby = {"dance","reading","cricket "};
        driver.findElement(By.xpath(".//input[@value='" + StringUtils.randomItems(hooby) + "']")).click();

        Paused.time(500);

        Select countryDropdown = new Select(driver.findElement(By.id("dropdown_7")));
        countryDropdown.selectByIndex(Integer.valueOf(StringUtils.randomRangeNumber(0,204)));

        Select mDropdown = new Select(driver.findElement(By.id("mm_date_8")));
        mDropdown.selectByValue(StringUtils.randomRangeNumber(1,12));

        Select dDropdown = new Select(driver.findElement(By.id("dd_date_8")));
        dDropdown.selectByValue(StringUtils.randomRangeNumber(1,28));

        Select yDropdown = new Select(driver.findElement(By.id("yy_date_8")));
        yDropdown.selectByVisibleText(StringUtils.randomRangeNumber(1970,1999));

        Paused.time(500);

        driver.findElement(By.id("phone_9")).sendKeys(StringUtils.randomString(10,"1234567890"));
        driver.findElement(By.id("username")).sendKeys("user_" + System.currentTimeMillis());
        driver.findElement(By.id("email_1")).sendKeys(StringUtils.randomString(10) + "@gmail.com");

        Paused.time(500);

        driver.findElement(By.id("password_2")).sendKeys("mYpa55w0rD");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("mYpa55w0rD");

        Paused.time(500);

        String filePath = System.getProperty("user.dir") + "/src/test/resources/java-logo.png";
        driver.findElement(By.id("profile_pic_10")).sendKeys(filePath);

        Paused.time(500);

        driver.findElement(By.name("pie_submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='post-49']/div/p")));
        String message = driver.findElement(By.xpath(".//*[@id='post-49']/div/p")).getText();
        assertEquals("Thank you for your registration",message);

        Paused.time(5000);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
