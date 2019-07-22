/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author ASUS
 */
public class Escena1 implements Vista {
    
    
    private Scene escena;
    
    public Button bpro;
    public Button bapor;
    public Label pregunta;

    public Button getBpro() {
        return bpro;
    }

    public void setBpro(Button bpro) {
        this.bpro = bpro;
    }

    public Button getBapor() {
        return bapor;
    }

    public void setBapor(Button bapor) {
        this.bapor = bapor;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Escena1() {
        this.pregunta = new Label("Que funcion cumple?");
        this.bpro = new Button ("promotor");
        this.bapor = new Button ("aportante");
        VBox layout = new VBox();
        HBox linea1 = new HBox(90);
        bpro.setMinSize(100, 100);
        bapor.setMinSize(100, 100);
        
       
        
        HBox linea2 = new HBox(90);
        linea1.getChildren().add(pregunta);
        linea2.getChildren().add(bpro);
        linea2.getChildren().add(bapor);
        layout.getChildren().add(linea1);
        layout.getChildren().add(linea2);
        this.escena=new Scene(layout,400,200);
        
    }
    
    

    @Override
    public Scene getscene() {
        return this.escena;
    }
    
    
    
}
