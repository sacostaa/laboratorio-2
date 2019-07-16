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
import static modelo.ArchivoDao.Proyectos;
import modelo.Dao;
import vista.Escenaapor1;
import vista.Escenaapor2;

/**
 *
 * @author ASUS
 */
public class Controladorapor2 {
    private Escenaapor2  vista;
    private Dao modelo;
    private int place;
    
     public Escenaapor2 getVista() {
        return vista;
    }

    public Controladorapor2() {
        
        this.vista = new Escenaapor2();
        
        
        
        vista.getSeguir().setOnAction(new Evento1());
    }
    
    private class Evento1 
      implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
            Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           for ( place = 0; place < Proyectos.size(); place++) {
            if (vista.getBotones().get(place).isSelected()) {
               
               break;
            }
            
        }
           Controladorapor3 controlador = new Controladorapor3(Proyectos.get(place).getNombre(),Double.toString(Proyectos.get(place).getPreciocamb()), Proyectos.get(place).getOrientacion(),Boolean.toString(Proyectos.get(place).isEstado()));
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 3 aportante");
           stage.setScene(escena);
           stage.show();
            
            
        }
     
     
}
}
