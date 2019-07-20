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
public class Escenaapor3 implements Vista{
    
    private Scene escena;
    private Label nombrel;
    private Label montominl;
    private Label orientacionl; 
    private Label estadol;
    private Button aportar;
    private Button pasar;
    private Button terminar;

    public Escenaapor3(String nombre, String montomin, String orientacion, String estado) {
        VBox layout = new VBox();
        HBox linea = new HBox();
        HBox lineaespacio = new HBox();
        HBox lineab = new HBox();
        
        this.nombrel = new Label(nombre);
        this.montominl = new Label (montomin);
        this.orientacionl = new Label (orientacion);
        this.pasar = new Button ("Pasar");
        this.aportar = new Button ("Aportar");
        this.terminar = new Button("Terminar");
        
        Label espacio = new Label ("        ");
            Label espacio1 = new Label ("        ");
            Label espacio2 = new Label ("        ");
            Label espacio3 = new Label ("        ");
            Label espaciob1 = new Label ("        ");
            Label espaciob2 = new Label ("        ");
            Label espaciob3 = new Label ("        ");
            Label espaciolespacio = new Label ("   ");
            if (Boolean.parseBoolean(estado) == true){
               this.estadol = new Label("disponible"); 
            }else{
                this.estadol = new Label("vendido"); 
            }
        linea.getChildren().add(nombrel);
        linea.getChildren().add(espacio);
        linea.getChildren().add(montominl);
        linea.getChildren().add(espacio1);
        linea.getChildren().add(orientacionl);
        linea.getChildren().add(espacio2);
        linea.getChildren().add(estadol);
        linea.getChildren().add(espacio3);
        lineaespacio.getChildren().add(espaciolespacio);
        lineab.getChildren().add(pasar);
        lineab.getChildren().add(espaciob1);
         lineab.getChildren().add(aportar);
         lineab.getChildren().add(espaciob2);
          lineab.getChildren().add(terminar);
        layout.getChildren().add(linea);
        layout.getChildren().add(lineaespacio);
        layout.getChildren().add(lineab);
        this.escena = new Scene(layout,600,600);
    }
    
    

    @Override
    public Scene getscene() {
        return this.escena;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Label getNombrel() {
        return nombrel;
    }

    public void setNombrel(Label nombrel) {
        this.nombrel = nombrel;
    }

    public Label getMontominl() {
        return montominl;
    }

    public void setMontominl(Label montominl) {
        this.montominl = montominl;
    }

    public Label getOrientacionl() {
        return orientacionl;
    }

    public void setOrientacionl(Label orientacionl) {
        this.orientacionl = orientacionl;
    }

    public Label getEstadol() {
        return estadol;
    }

    public void setEstadol(Label estadol) {
        this.estadol = estadol;
    }

    public Button getAportar() {
        return aportar;
    }

    public void setAportar(Button aportar) {
        this.aportar = aportar;
    }

    public Button getPasar() {
        return pasar;
    }

    public void setPasar(Button pasar) {
        this.pasar = pasar;
    }

    public Button getTerminar() {
        return terminar;
    }

    public void setTerminar(Button terminar) {
        this.terminar = terminar;
    }
    
    
    
}
