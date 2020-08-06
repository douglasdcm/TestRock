/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import Strategy.Acao;
import componentizacao.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Douglas
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/");
        
        //Login2 é um objeto do tipo Strategy
        Login2 login = new Login2();
        login.setParametros("testrockchannel@gmail.com","senhafalsa");
        
        //Usando o Strategy para definir a acao de logar
        Acao acao = new Acao(login);
        System.out.println("Login " + acao.executar(driver));
        
        //Usando o Strategy para definir a acao de acessar a rede
        acao = new Acao(new AcessarMinhaRede2());
        System.out.println("AcessarMinhaRede " + acao.executar(driver));
        driver.quit();
    }
    
}
