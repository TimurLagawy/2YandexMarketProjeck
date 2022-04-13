package ruYandexMarket;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
    @Test
public void  signUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Цімур\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://market.yandex.ru/");
    }

}
