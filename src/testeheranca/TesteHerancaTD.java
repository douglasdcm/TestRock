/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeheranca;

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
import testeheranca.Test;
import testeheranca.Test2;

/**
 *
 * @author TestRock!
 */
public class TesteHerancaTD {
    public static void mainOLD (String args[]) throws InterruptedException{
        System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        String status;
        
        //Executando os casos de teste: testCase1, testCase2, testCase3
        Test test = new Test();
        Test2 test2 = new Test2();
        
        status = test.testCase1(driver);
        System.out.println("test.testCase1 " + status);
        
        status = test.testCase2(driver);
        System.out.println("test.testCase2 " + status);
        
        status = test2.testCase3(driver);
        System.out.println("test2.testCase3 " + status);
        
        //Executando o caso de teste herdado da superclasse
        status = test2.testCase1(driver);
        System.out.println("test2.testCase1 herdado " + status);
        
        driver.quit();
        
    }
    
}
