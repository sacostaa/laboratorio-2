/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Dao;
import vista.Escena1;

/**
 *
 * @author ASUS
 */
public class Controlador1 {
    private Escena1 vista;
    private Dao modelo;

    public Escena1 getVista() {
        return vista;
    }

    
    public Controlador1() {
      this.vista = 
              new Escena1();
      this.vista.getBpro()
                .setOnAction(new Evento1());
      this.vista.getBapor().setOnAction(new Evento2());
    }
    
    private class Evento1 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
            Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorprom1 controlador = new Controladorprom1();
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 1 pormotor");
           stage.setScene(escena);
           stage.show();
   
      
        }
    }
    private class Evento2 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
            Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorapor1 controlador = new Controladorapor1();
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 1 aportador");
           stage.setScene(escena);
           stage.show();
   
//          
        }
    }
    
}
