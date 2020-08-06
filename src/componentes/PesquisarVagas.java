/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import objectrepository.ObjectRepository;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class PesquisarVagas {
                
        public String pesquisar (WebDriver driver, String cargo, String localidade) throws InterruptedException {
            String status = "";
            Thread.sleep(5000);
            ObjectRepository.LinkedIn.Vagas.caixaPesquisaCargo(driver).sendKeys(cargo);            
            ObjectRepository.LinkedIn.Vagas.caixaPesquisaLocalidade(driver).sendKeys(localidade);
            ObjectRepository.LinkedIn.Vagas.botaoPesquisar(driver).sendKeys(Keys.RETURN);
            status = "Passed";
            return status;
        }
            
}
