/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.Dao;
import vista.Escenaapor1;
import vista.Escenapro1;

/**
 *
 * @author ASUS
 */
public class Controladorprom1 {
    private Escenapro1 escena;
    private Dao modelo;

    public Escenapro1 getVista() {
        return escena;
    }

    
    public Controladorprom1() {
      this.escena = 
              new Escenapro1();
      this.escena.getRegistrarse().setOnAction(new Evento1 ());
      
    }
    
    private class Evento1 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
   
//          
        }
    
}
    
}
