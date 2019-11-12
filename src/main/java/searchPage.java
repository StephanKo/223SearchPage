import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class searchPage {

   public static void main(String[] args){
    }
        @Test
        public void searchPage() {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe"); //путь к драйверу
            WebDriver driver = new ChromeDriver();// инициализация вебдрайвера
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// ожидание исполнения скрипта 10 сек
            driver.manage().window().maximize();//раскрытие окно на весь экран
            WebDriverRunner.setWebDriver(driver);

            driver.get("https://223.rts-tender.ru/supplier/auction/Trade/Search.aspx"); // открываем страницу поиска закупок

        }
/*    public class dates(){
        String startDate = "30.10.2019";
        String endDate = "31.10.2019";
    }*/
    }

