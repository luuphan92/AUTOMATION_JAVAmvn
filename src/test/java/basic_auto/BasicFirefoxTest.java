package basic_auto;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 4/5/17 01:54.
 */
public class BasicFirefoxTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
    }

    @Test
    public void TestCase1() {

        driver.findElement(By.id("name_3_firstname")).sendKeys("Tom");
        driver.findElement(By.id("name_3_lastname")).sendKeys("Tran");

        driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
        driver.findElement(By.xpath(".//input[@value='dance']")).click();

        String filePath = System.getProperty("user.dir") + "/src/test/resources/java-logo.png";
        driver.findElement(By.id("profile_pic_10")).sendKeys(filePath);

    }

   @After
    public void tearDown() {
        driver.quit();
    }
}
