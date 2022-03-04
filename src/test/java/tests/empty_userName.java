package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class empty_userName {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\test_task\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("login.com");

        driver.manage().window().maximize();

        //user_name disindaki webelementlere input girilir.

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("g.C.1998");

        String checkBoxCssValue = "label[for = '***'] span.******";
        WebElement checkBox = driver.findElement(new By.ByCssSelector(checkBoxCssValue));
        checkBox.click();

        WebElement login_btn = driver.findElement(By.id("login_ button"));
        login_btn.click();

        WebElement userNAme_text = driver.findElement(By.xpath("path"));
        String userNameControl = userNAme_text.getText();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());

        if (userNameControl == ""){ //if durumunda expected ve actual result karsilastirmasi da yapabilirdik.
            driver.switchTo().alert().sendKeys("Please enter a user name");
        }

        else {
            System.out.println("Empty User Name Testi Basarisiz");
        }





    }
}
