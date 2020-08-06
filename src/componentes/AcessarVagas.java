/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class AcessarVagas {

        public String acessar (WebDriver driver) {
            String status = "";
            ObjectRepository.LinkedIn.Vagas.iconeAcesso(driver).click();
            status = "Passed";
            return status;
        } 
    
}
