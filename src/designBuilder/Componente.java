/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designBuilder;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author TestRock!
 */
public abstract class Componente {
    
    public void setParametro(String tipo, String valor) {}
    public void executar(WebDriver driver) {}

}
