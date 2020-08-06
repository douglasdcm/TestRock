/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public class Acao {
   private Strategy strategy;

   public Acao(Strategy strategy){
      this.strategy = strategy;
   }
   
   public String executar(WebDriver driver){
      return strategy.executar(driver);
   }    
}
