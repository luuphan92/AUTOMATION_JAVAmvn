package complete_submit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 6/7/17 21:38.
 */
public class RegistrationChromeFixedDataTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
    }

    @Test
    public void TestCase1() throws InterruptedException {

        driver.findElement(By.name("first_name")).sendKeys("Tom");
        driver.findElement(By.name("last_name")).sendKeys("Tran");

        driver.findElement(By.xpath(".//input[@value='single']")).click();
        driver.findElement(By.xpath(".//input[@value='dance']")).click();

        Select countryDropdown = new Select(driver.findElement(By.id("dropdown_7")));
        countryDropdown.selectByVisibleText("Vietnam");

        Select mDropdown = new Select(driver.findElement(By.id("mm_date_8")));
        mDropdown.selectByIndex(3);

        Select dDropdown = new Select(driver.findElement(By.id("dd_date_8")));
        dDropdown.selectByIndex(25);

        Select yDropdown = new Select(driver.findElement(By.id("yy_date_8")));
        yDropdown.selectByValue("1990");

        driver.findElement(By.id("phone_9")).sendKeys("0901234567");
        driver.findElement(By.id("username")).sendKeys("my_username_1");
        driver.findElement(By.id("email_1")).sendKeys("my_gmail_example2@gmail.com");

        driver.findElement(By.id("password_2")).sendKeys("mYpa55w0rD");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("mYpa55w0rD");

        String filePath = System.getProperty("user.dir") + "/src/test/resources/java-logo.png";
        driver.findElement(By.id("profile_pic_10")).sendKeys(filePath);

        driver.findElement(By.name("pie_submit")).click();

        Thread.sleep(10000); //thread to sleep for 5000 milliseconds = 5s

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
