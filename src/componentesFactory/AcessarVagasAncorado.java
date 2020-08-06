/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentesFactory;

import casosTesteIdDinamico.CasoTeste1;
import designFactory.Componente;
import designFactory.ComponenteFactory;
import iddinamico.Interacao;
import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class AcessarVagasAncorado {


    public void executar (WebDriver driver) {
        //String status = "";
        ComponenteFactory componenteFactory = new ComponenteFactory();        
        Componente componente = componenteFactory.getComponente("AcessarMinhaRede");
        
        //try {
        //    //Passa a diferênça de localização e clica no novo ponto
        //    Interacao.click(componente, 0, 0);
        //} catch (AWTException ex) {
        //    Logger.getLogger(CasoTeste1.class.getName()).log(Level.SEVERE, null, ex);
        //}        
        
        ObjectRepository.LinkedIn.Vagas.iconeAcesso(driver).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AcessarVagas.class.getName()).log(Level.SEVERE, null, ex);
        }
        //status = "Passed";
        //return status;
    }     
}
