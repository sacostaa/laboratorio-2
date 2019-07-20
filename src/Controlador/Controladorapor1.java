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
              new Escenaapor1("");
      this.escena.getRegistrarse().setOnAction(new Evento1());
      
    }
    
    private class Evento1 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
           
           
                
            
            try{
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
            }catch(NumberFormatException ex){
                  /* Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorapor1 controlador = new Controladorapor1();
           controlador.setEscena(new Escenaapor1("solo se pueden ingresar numeros"));
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 2 aportante");
           stage.setScene(escena);
           stage.show();
                
*/
                  System.out.println("solo ingrese numeros cuando se le pidan alguno");
                   }
            
           
                
            
           }
   
//          
        }
    
    public void agegar(){
        
    }

    public Escenaapor1 getEscena() {
        return escena;
    }

    public void setEscena(Escenaapor1 escena) {
        this.escena = escena;
    }

    public Dao getModelo() {
        return modelo;
    }

    public void setModelo(Dao modelo) {
        this.modelo = modelo;
    }
    
    
    
}
    
