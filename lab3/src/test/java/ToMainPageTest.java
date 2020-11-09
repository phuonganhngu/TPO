// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ToMainPageTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    if(SetUp.Platform == 0) {
      System.setProperty("webdriver.chrome.driver", SetUp.chrome);
      driver = new ChromeDriver();
    }else{
      System.setProperty("webdriver.gecko.driver", SetUp.firefox);
      driver = new FirefoxDriver();
    }
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void toMainPage() {
    driver.get("https://www.gmx.net/");
    driver.manage().window().setSize(new Dimension(786, 698));
    driver.switchTo().frame(0);
    driver.switchTo().frame(0);

    {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\'save-all-conditionally\']")));
    }
    driver.findElement(By.xpath("//button[@id=\'save-all-conditionally\']")).click();

    driver.switchTo().defaultContent();
    driver.switchTo().defaultContent();

    {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),\'E-Mail & Cloud\')]")));
    }
    driver.findElement(By.xpath("//a[contains(text(),\'E-Mail & Cloud\')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),\'GMX\')]")).click();
    {
      WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'E-Mail & Cloud\')]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}
