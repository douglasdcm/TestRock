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
public class Login {     
        
        public String logar (WebDriver driver, String email, String senha) {
            String status = "";
            ObjectRepository.LinkedIn.Login.emailBox(driver).sendKeys(email);
            ObjectRepository.LinkedIn.Login.passwordBox(driver).sendKeys(senha);
            ObjectRepository.LinkedIn.Login.loginButton(driver).click();
            status = "Passed";
            return status;
        }
    
}
