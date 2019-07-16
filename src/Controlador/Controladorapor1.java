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
import modelo.Aportante;
import modelo.Dao;
import vista.Escena1;
import vista.Escenaapor1;
import modelo.ArchivoDao;
import static modelo.ArchivoDao.aportantes;


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
            String nombre = escena.getTnombre().getText(); 
            String apellido = escena.getTapellido().getText();
            String nombreent = escena.getTnombreent().getText();
            String correo = escena.getTcorreo().getText();
            int tell = Integer.parseInt(escena.getTtell().getText());
            aportantes.add(new Aportante(nombre,apellido,nombreent,correo,tell));
           Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorapor2 controlador = new Controladorapor2();
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 2 aportante");
           stage.setScene(escena);
           stage.show();
           }
   
//          
        }
    
    public void agegar(){
        
    }
    
}
    
