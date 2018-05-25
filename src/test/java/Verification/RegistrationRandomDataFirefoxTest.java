package Verification;

import complete_submit.Paused;
import complete_submit.StringUtils;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 4/3/17 14:18.
 */
public class RegistrationRandomDataFirefoxTest {
    private WebDriver driver;
    // tạo data random cho test

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
    }

    @Test
    public void TestCase1() throws InterruptedException {

        driver.findElement(By.name("first_name")).sendKeys(StringUtils.randomString(5));
        driver.findElement(By.name("last_name")).sendKeys(StringUtils.randomString(5));

        Paused.time(5000); //after inputting Last Name, it will paused 5 seconds.

        String[] maritalStatus = {"single","married","divorced"};
        driver.findElement(By.xpath(".//input[@value='" + StringUtils.randomItems(maritalStatus) + "']")).click();

        String[] hooby = {"dance","reading","cricket "};
        driver.findElement(By.xpath(".//input[@value='" + StringUtils.randomItems(hooby) + "']")).click();

        Thread.sleep(5000); // after selecting, thread to sleep 5 seconds.

        Select countryDropdown = new Select(driver.findElement(By.id("dropdown_7")));
        countryDropdown.selectByIndex(Integer.valueOf(StringUtils.randomRangeNumber(0,204)));

        Select mDropdown = new Select(driver.findElement(By.id("mm_date_8")));
        mDropdown.selectByValue(StringUtils.randomRangeNumber(1,12));

        Select dDropdown = new Select(driver.findElement(By.id("dd_date_8")));
        dDropdown.selectByValue(StringUtils.randomRangeNumber(1,28));

        Select yDropdown = new Select(driver.findElement(By.id("yy_date_8")));
        yDropdown.selectByVisibleText(StringUtils.randomRangeNumber(1970,1999));

        Paused.time(1000);

        driver.findElement(By.id("phone_9")).sendKeys(StringUtils.randomString(10,"1234567890"));
        driver.findElement(By.id("username")).sendKeys("user_" + System.currentTimeMillis());
        driver.findElement(By.id("email_1")).sendKeys(StringUtils.randomString(10) + "@gmail.com");

        Paused.time(1000);

        driver.findElement(By.id("password_2")).sendKeys("mYpa55w0rD");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("mYpa55w0rD");

        Paused.time(1000);

        String filePath = System.getProperty("user.dir") + "/src/test/resources/java-logo.png";
        driver.findElement(By.id("profile_pic_10")).sendKeys(filePath);

        Paused.time(1000);

        driver.findElement(By.name("pie_submit")).click();

        Thread.sleep(10000);

    }

    @After
    public void tearDown() {
       driver.quit();
    }
}
