/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentizacao;

import objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Douglas
 */
public class PreencherCargo {

        String cargo;
        
        public void setCargo (String cargo){
            this.cargo = cargo;
        } 
    
        public String preencherCaixaPesquisaCargo (WebDriver driver) {
            String status = "";
            ObjectRepository.LinkedIn.Vagas.caixaPesquisaCargo(driver).sendKeys(this.cargo);
            status = "Passed";
            return status;
        } 
    
}
