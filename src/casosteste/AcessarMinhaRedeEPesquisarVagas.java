/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casosteste;

import componentizacao.AcessarMensagens;
import componentizacao.AcessarMinhaRede;
import componentizacao.AcessarVagas;
import componentizacao.Login;
import componentizacao.PesquisarVagas;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author TestRock!
 */
public class AcessarMinhaRedeEPesquisarVagas {
    
    public static void run (){
            
            System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://www.linkedin.com/");            
            String status;            
            System.out.println("AcessarMinhaRedeEPesquisarVagas Início Status");
            
            //O caso de teste
            //instancia os componentes que vai usar
            Login login = new Login();
            AcessarMinhaRede acessarMinhaRede = new AcessarMinhaRede();
            AcessarVagas acessarVagas = new AcessarVagas();
            PesquisarVagas pesquisarVagas = new PesquisarVagas();

            //solicitar que a classe especialista logue no LinkedIn

            //solicitar que a classe especialista acesse a página Minha Rede

            //solicitar que a classe especialista acesse a página Vagas

            //solicitar que a classe especialista pesquise o cargo e localidade

            //fechar browser
            driver.quit();
            
            System.out.println("AcessarMinhaRedeEPesquisarVagas Fim Status");
    }    
    
}
