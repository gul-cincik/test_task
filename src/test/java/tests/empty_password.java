package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class empty_password {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\test_task\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("login.com");

        driver.manage().window().maximize();

        //password disindaki webelementlere input girilir.


        WebElement user_name = driver.findElement(By.id("user_name"));
        user_name.click();
        user_name.sendKeys("gul-cincik");

        String checkBoxCssValue = "label[for = '***'] span.******";
        WebElement checkBox = driver.findElement(new By.ByCssSelector(checkBoxCssValue));
        checkBox.click();

        WebElement login_btn = driver.findElement(By.id("login_ button"));
        login_btn.click();

        WebElement password_text = driver.findElement(By.xpath("path"));
        String password_textControl = password_text.getText();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());

        if (password_textControl == "") {
            driver.switchTo().alert().sendKeys("Please enter your password");
        } else {
            System.out.println("Empty Password Testi basarisiz!");
        }

    }
}
