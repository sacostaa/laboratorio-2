/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author ASUS
 */
public class Escenaapor3 implements Vista{
    
    private Scene escena;
    private Label nombrel;
    private Label montominl;
    private Label orientacionl; 
    private Label estadol;

    public Escenaapor3(String nombre, String montomin, String orientacion, String estado) {
        VBox layout = new VBox();
        HBox linea = new HBox();
        this.nombrel = new Label(nombre);
        this.montominl = new Label (montomin);
        this.orientacionl = new Label (orientacion);
        this.estadol = new Label (estado);
        Label espacio = new Label ("        ");
            Label espacio1 = new Label ("        ");
            Label espacio2 = new Label ("        ");
            Label espacio3 = new Label ("        ");
        linea.getChildren().add(nombrel);
        linea.getChildren().add(espacio);
        linea.getChildren().add(montominl);
        linea.getChildren().add(espacio1);
        linea.getChildren().add(orientacionl);
        linea.getChildren().add(espacio2);
        linea.getChildren().add(estadol);
        linea.getChildren().add(espacio3);
        layout.getChildren().add(linea);
        this.escena = new Scene(layout,600,600);
    }
    
    

    @Override
    public Scene getscene() {
        return this.escena;
    }
    
}
