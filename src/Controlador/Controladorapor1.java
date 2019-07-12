/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.Dao;
import vista.Escena1;
import vista.Escenaapor1;

/**
 *
 * @author ASUS
 */
public class Controladorapor1 {
    
    private Escenaapor1 escena;
    private Dao modelo;

    public Escenaapor1 getVista() {
        return escena;
    }

    
    public Controladorapor1() {
      this.escena = 
              new Escenaapor1();
      this.escena.getRegistrarse().setOnAction(new Evento1());
      
    }
    
    private class Evento1 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
   
//          
        }
    
}
    }
