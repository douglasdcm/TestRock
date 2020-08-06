/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeheranca;

import objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class Test2 extends Test {
  
    //testCase1 herdado

    //testCase2 herdado

    //testCase3 adicionado
    public String testCase3 (WebDriver driver) {
         
        String status = "";        
        ObjectRepository.Google.searchBox(driver).sendKeys("UFRJ");
        ObjectRepository.Google.searchBox(driver).clear();
        ObjectRepository.Google.searchBox(driver).sendKeys("UFF"); //fluxo adicionado
        //ObjectRepository.Google.searchButton(driver).click();
        //ObjectRepository.Google.googleNews(driver).click(); 
        ObjectRepository.Google.googleLogo(driver).click();
        status = "Passed";
        return status;
        
    }
    
    
}
