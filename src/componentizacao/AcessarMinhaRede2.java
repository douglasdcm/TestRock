/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import Strategy.Strategy;
import objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class AcessarMinhaRede2 implements Strategy{
           
        public String executar (WebDriver driver) {
            String status = "";
            ObjectRepository.LinkedIn.MinhaRede.iconeAcesso(driver).click();
            status = "Passed";
            return status;
        }   
    
}
