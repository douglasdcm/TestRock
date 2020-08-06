/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import Strategy.Strategy;
import java.util.List;
import objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class Login2 implements Strategy {     
        
        private String email;
        private String senha;
        private String executar;
    
        public void setParametros (String email, String senha) {
            this.email = email;
            this.senha = senha;
        }
    
        @Override
        public String executar (WebDriver driver) {
            String status = "";
            ObjectRepository.LinkedIn.Login.emailBox(driver).sendKeys(this.email);
            ObjectRepository.LinkedIn.Login.passwordBox(driver).sendKeys(this.senha);
            ObjectRepository.LinkedIn.Login.loginButton(driver).click();
            status = "Passed";
            return status;
        }
    
}
