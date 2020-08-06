/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author TestRock!
 */
public class ObjectRepository {
    
    public static class LinkedIn {
        
        public static class Login {
        
            public static WebElement emailBox (WebDriver driver) {

               WebElement element = null;

               // Escreva o código para achar o elemento aqui
               element = driver.findElement(By.id("login-email"));

               return element;

            }

            public static WebElement passwordBox (WebDriver driver) {

               WebElement element = null;

               // Escreva o código para achar o elemento aqui
               element = driver.findElement(By.id("login-password"));

               return element;

            }

            public static WebElement loginButton (WebDriver driver) {

               WebElement element = null;

               // Escreva o código para achar o elemento aqui
               element = driver.findElement(By.id("login-submit"));

               return element;

            }
        }
                
        public static class MinhaRede {
        
            public static WebElement iconeAcesso (WebDriver driver) {

               WebElement element = null;
               
               // Escreva o código para achar o elemento aqui
               element = driver.findElement(By.xpath(".//*[@id='mynetwork-nav-item']/a/span[2]"));

               return element;

            }
        }    
    
        public static class Vagas {
        
            public static WebElement iconeAcesso (WebDriver driver) {

               WebElement element = null;
               
               // Escreva o código para achar o elemento aqui
               element = driver.findElement(By.xpath(".//*[@id='jobs-nav-item']/a/span[2]"));

               return element;

            }
            
            public static WebElement caixaPesquisaCargo (WebDriver driver) {

               WebElement element = null;
               
               // Escreva o código para achar o elemento aqui
               element = driver.findElement(By.xpath(".//*[@placeholder='Pesquise vagas por cargo, palavra-chave ou empresa…']"));

               return element;

            }
            
            public static WebElement caixaPesquisaLocalidade (WebDriver driver) {

               WebElement element = null;
               
               // Escreva o código para achar o elemento aqui
               element = driver.findElement(By.xpath(".//*[@placeholder='Cidade, estado, código postal ou país']"));

               return element;

            }
            
            public static WebElement botaoPesquisar (WebDriver driver) {

               WebElement element = null;
               
               // Escreva o código para achar o elemento aqui
               //element = driver.findElement(By.cssSelector("button.submit-button"));
               element = ObjectRepository.LinkedIn.Vagas.caixaPesquisaLocalidade(driver);

               return element;

            }
            
        } 
    
        public static class Mensagens {
        
            public static WebElement iconeAcesso (WebDriver driver) {

               WebElement element = null;
               
               // Escreva o código para achar o elemento aqui
               element = driver.findElement(By.xpath(".//*[@id='messaging-nav-item']/a/span[2]"));

               return element;

            }
            
        }    
        
    }
    
    public static class Google {
        
        public static WebElement searchBox (WebDriver driver) {
           
           WebElement element = null;

           // Write Code to find element here
           element = driver.findElement(By.id("lst-ib"));

           return element;
            
        }
        
        public static WebElement searchButton (WebDriver driver) {
           
           WebElement element = null;

           // Write Code to find element here
           element = driver.findElement(By.name("btnK"));

           return element;
            
        }
        
        public static WebElement googleLogo (WebDriver driver) {
           
           WebElement element = null;

           // Write Code to find element here
           element = driver.findElement(By.id("logo"));

           return element;
            
        }
        
        public static WebElement googleNews (WebDriver driver) {
           
           WebElement element = null;

           // Write Code to find element here
           element = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]"));

           return element;
            
        }
                
    }
    
}
