/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package casosTesteBuilder;

import componentesBuilder.DriverFactory;
import designBuilder.Componente;
import designBuilder.ComponenteBuilder;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class CasoTeste1{
    public static void run(){
        //Insira o código do seu teste aqui
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver = driverFactory.setBrowser("Chrome");
        driver.get("https://www.linkedin.com/");
        
        ComponenteBuilder componenteBuilder = new ComponenteBuilder();
        
        //Construindo o componente Login
        Componente componente = componenteBuilder.getComponente("Login");       
        componente.setParametro("email", "testrockchannel@gmail.com");
        componente.setParametro("senha", "carneFraca");
        componente.executar(driver);
        
        componenteBuilder.getComponente("AcessarMensagens").executar(driver);
        
        //Construindo o componente EnviarMensagem
        componente = componenteBuilder.getComponente("EnviarMensagem");
        componente.setParametro("conta", "Conta Fake");
        componente.setParametro("texto", "Inscreva-se no canal TestRock! :)");        
        componente.executar(driver);

        //fechar browser
        driver.quit();
    }    
}
