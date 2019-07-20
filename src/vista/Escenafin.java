/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author ASUS
 */
public class Escenafin implements Vista{
    private Scene escena;
    private Label mensaje;

    public Label getMensaje() {
        return mensaje;
    }

    public void setMensaje(Label mensaje) {
        this.mensaje = mensaje;
    }

    public Escenafin() {
        this.mensaje = new Label("Operacion Terminada");
        VBox layout = new VBox();
        layout.getChildren().add(mensaje);
        this.escena = new Scene(layout,600,600);
        
        
    }

    @Override
    public Scene getscene() {
        return this.escena;    }
    
    
    
}
