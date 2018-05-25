package first_script;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 4/4/17 19:32.
 */
public class SeleniumFirstScriptFirefoxTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com.vn/");
    }

    @Test
    public void CheckSiteTitle() {
        String title = driver.getTitle();
        assertEquals("Google",title);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
