package first_script;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 4/4/17 19:48.
 */
public class SeleniumFirstScriptChromeTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com.vn");
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
