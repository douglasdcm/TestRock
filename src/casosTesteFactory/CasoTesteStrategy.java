/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casostestestrategy;

import Strategy.Acao;
import componentesstrategy.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author TestRock!
 */
public class CasoTesteStrategy {

    public static void run (){
                        
        System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/");
        
        //instancia objeto
        Login login = new Login();
        login.setParametros("testrockchannel@gmail.com", "caneta");

        Acao acao = new Acao(login);
        acao.executar(driver));
        
        acao = new Acao(new AcessarMensagens());
        acao.executar(driver);
        
        acao = new Acao(new AcessarVagas());
        acao.executar(driver)); 
        
        PesquisarVagas pesquisarVagas = new PesquisarVagas();
        pesquisarVagas.setParametros("QA", "Brasil");
        acao = new Acao(pesquisarVagas);
        acao.executar(driver));        

        //fechar browser
        driver.quit();
            
    }
    
}
