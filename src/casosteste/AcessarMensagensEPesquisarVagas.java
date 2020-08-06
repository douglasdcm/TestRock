/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casosteste;

import componentizacao.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author TestRock!
 */
public class AcessarMensagensEPesquisarVagas {

    public static void run () throws InterruptedException{
            
            System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://www.linkedin.com/");            
            String status;            
            System.out.println("AcessarMensagensEPesquisarVagas Início Status");
            
            //O caso de teste
            //instancia os componentes que vai usar
            Login login = new Login();
            AcessarMinhaRede acessarMinhaRede = new AcessarMinhaRede();
            AcessarVagas acessarVagas = new AcessarVagas();
            PesquisarVagas pesquisarVagas = new PesquisarVagas();
            AcessarMensagens acessarMensagens = new AcessarMensagens();

            //solicitar que a classe especialista logue no LinkedIn
            status = login.logar(driver, "testrockchannel@gmail.com","senhafalsa");
            System.out.println("login.logar " + status);

            //solicitar que a classe especialista acesse a página Minha Rede
            status = acessarMinhaRede.acessar(driver);
            System.out.println("acessarMinhaRede.acessar " + status);

            //solicitar que a classe especialista acesse a página Vagas
            status = acessarVagas.acessar(driver);
            System.out.println("acessarVagas.acessar " + status);

            //solicitar que a classe especialista pesquise o cargo e localidade
            status = pesquisarVagas.pesquisar(driver, "Selenium", "Brasil");
            System.out.println("pesquisarVagas.pesquisar " + status);

            //solicitar que a classe especialista acesse a página Mensagens
            status = acessarMensagens.acessar(driver);
            System.out.println("acessarMensagens.acessar " + status);

            //fechar browser
            driver.quit();
            
            System.out.println("AcessarMensagensEPesquisarVagas Fim Status");
    }
    
}
