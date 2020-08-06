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
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class Test {
    
    public String testCase1 (WebDriver driver) {
        
        String status = "";        
        ObjectRepository.Google.searchBox(driver).sendKeys("UERJ");
        //ObjectRepository.Google.searchButton(driver).click();
        ObjectRepository.Google.googleLogo(driver).click();
        status = "Passed";
        return status;
    }
    
    public String testCase2 (WebDriver driver) {
            
        String status = "";        
        ObjectRepository.Google.searchBox(driver).sendKeys("UFMG");
        //ObjectRepository.Google.searchButton(driver).click();
        ObjectRepository.Google.googleLogo(driver).click();
        status = "Passed";
        return status;
    }
    
}
