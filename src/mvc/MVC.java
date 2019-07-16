/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Controlador.Controlador1;
import Controlador.Singleton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.ArchivoDao;
import vista.Escena1;
import vista.Escenaapor1;
import vista.Escenapro1;

/**
 *
 * @author ASUS
 */
public class MVC extends Application{
    
    public static void main(String[] args) {
        Application.launch(args);
        ArchivoDao archivo = new ArchivoDao();
        archivo.guardarproyecto();
            
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
       Singleton singleton = Singleton.getSingleton();
       singleton.setStage(primaryStage);
       ArchivoDao archivo = new ArchivoDao();
       archivo.guardarproyecto();
       Controlador1 controlador = new Controlador1();
       Scene escena = controlador.getVista().getscene();
       primaryStage.setTitle("Escena 1");
       primaryStage.setScene(escena);
       primaryStage.show();
       
    }
    
    
}
