/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentizacao;

import casosteste.*;
import componentizacao.*;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectrepository.ObjectRepository;
import testeheranca.Test;
import testeheranca.Test2;

/**
 *
 * @author TestRock!
 */
public class ComponentizacaoTD {
    public static void mainOLD (String args[]) throws InterruptedException{        
        
        //instacia o caso de teste
        AcessarMensagensEPesquisarVagas AcessarMensagensEPesquisarVagas = new AcessarMensagensEPesquisarVagas();
        
        //executa o caso de teste
        //AcessarMensagensEPesquisarVagas.run();
        AcessarMinhaRedeEPesquisarVagas.run();
        
        
    }
    
}
