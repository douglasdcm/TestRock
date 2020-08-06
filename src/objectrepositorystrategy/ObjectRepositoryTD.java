/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrock;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectrepository.ObjectRepository;

/**
 *
 * @author TestRock!
 */
public class ObjectRepositoryTD { //mudar para TestRock quando for usar
    public static void mainOLD (String args[]) throws InterruptedException{
        System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://www.linkedin.com/");
        ObjectRepository.LinkedIn.Login.emailBox(driver).sendKeys("myemail@gmail.com");
        ObjectRepository.LinkedIn.Login.passwordBox(driver).sendKeys("minhasenha");
        ObjectRepository.LinkedIn.Login.loginButton(driver).click();        
    }
    
}
