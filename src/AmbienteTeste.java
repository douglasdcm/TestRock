/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentizacao;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Douglas
 */
public class AmbienteTeste {
    
    String url;
    
    public void setURL (String url){        
        this.url = url;        
    }    
    
    public FirefoxDriver montarAmbienteFirefox (){
        
            System.setProperty("webdriver.firefox.marionette","C:\\Selenium\\geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            driver.get(this.url);            
            return driver;
    }
    
}
