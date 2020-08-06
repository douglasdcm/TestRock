/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designBuilder;

import componentesBuilder.*;

/**
 *
 * @author TestRock!
 */
public class ComponenteBuilder {
   
       private Componente componente;
       
        //Recebe o Componente 
        public Componente getComponente(String componente){
           if(componente == null){
              return null;
           }		
           if(componente.equalsIgnoreCase("Login")){
              return new Login();

           } else if(componente.equalsIgnoreCase("AcessarMinhaRede")){
              return new AcessarMinhaRede();

           } else if(componente.equalsIgnoreCase("AcessarMensagens")){
              return new AcessarMensagens();

           } else if(componente.equalsIgnoreCase("AcessarVagas")){
              return new AcessarVagas();

           } else if(componente.equalsIgnoreCase("PesquisarVagas")){
              return new PesquisarVagas();
           } else if(componente.equalsIgnoreCase("EnviarMensagem")){
              return new EnviarMensagem();
           }      
           return null;
        }
       
       //public Componente setParametro (String parametro, String valor){
       //    componente.setParametro (parametro, valor);
       //    return componente;
       //}
}
