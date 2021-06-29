import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    public static WebDriver driver;
    public static Properties properties;
    public static String PROJECTPATH = System.getProperty("user.dir");

    public BaseTest() {

        try {
            properties=new Properties();
            FileInputStream io = new FileInputStream(PROJECTPATH + "\\src\\main\\resources\\Configuration\\Configuration.properties");
            properties.load(io);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initialize() {

        String browser = properties.getProperty("browser");
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", PROJECTPATH + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println(driver);
            PageFactory.initElements(driver, this);
        }
        String url=properties.getProperty("url");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

}
