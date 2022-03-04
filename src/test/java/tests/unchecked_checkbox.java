package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class unchecked_checkbox {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\test_task\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("login.com");

        driver.manage().window().maximize();

        //user_name ve password inputlarına deger girilir.

        WebElement user_name = driver.findElement(By.id("user_name"));
        user_name.click();
        user_name.sendKeys("gul-cincik");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("g.C.1998");

        String checkBoxCssValue = "label[for = '***'] span.******";
        WebElement checkBox = driver.findElement(new By.ByCssSelector(checkBoxCssValue));
        //checkBox.click(); checkbox bos birakilir

        WebElement login_btn = driver.findElement(By.id("login_ button"));
        login_btn.click();


        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());

        String checkBoxClassName = checkBox.getAttribute("class");//checkbox'ın isaretli olmadigi durumdaki classına ulasilir

        if (checkBoxClassName.equals("unchecked class name")){
            driver.switchTo().alert().sendKeys("Please check the box");
        }
        else {
            System.out.println("Checkbox testi basarisiz!");
        }
    }
}
