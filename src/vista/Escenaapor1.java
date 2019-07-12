/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author ASUS
 */
public class Escenaapor1 implements Vista {
    private Scene escena;
    private Label favor;
    private Label lnombre;
    private Label lapellido;
    private Label lnombreent;
    private Label lcorreo;
    private Label ltell;
    private TextField tnombre;
    private TextField tapellido;
    private TextField tnombreent;
    private TextField tcorreo;
    private TextField ttell;
    private Button registrarse;

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    public Label getFavor() {
        return favor;
    }

    public void setFavor(Label favor) {
        this.favor = favor;
    }

    public Label getLnombre() {
        return lnombre;
    }

    public void setLnombre(Label lnombre) {
        this.lnombre = lnombre;
    }

    public Label getLapellido() {
        return lapellido;
    }

    public void setLapellido(Label lapellido) {
        this.lapellido = lapellido;
    }

    public Label getLnombreent() {
        return lnombreent;
    }

    public void setLnombreent(Label lnombreent) {
        this.lnombreent = lnombreent;
    }

    public Label getLcorreo() {
        return lcorreo;
    }

    public void setLcorreo(Label lcorreo) {
        this.lcorreo = lcorreo;
    }

    public Label getLtell() {
        return ltell;
    }

    public void setLtell(Label ltell) {
        this.ltell = ltell;
    }

    public TextField getTnombre() {
        return tnombre;
    }

    public void setTnombre(TextField tnombre) {
        this.tnombre = tnombre;
    }

    public TextField getTapellido() {
        return tapellido;
    }

    public void setTapellido(TextField tapellido) {
        this.tapellido = tapellido;
    }

    public TextField getTnombreent() {
        return tnombreent;
    }

    public void setTnombreent(TextField tnombreent) {
        this.tnombreent = tnombreent;
    }

    public TextField getTcorreo() {
        return tcorreo;
    }

    public void setTcorreo(TextField tcorreo) {
        this.tcorreo = tcorreo;
    }

    public TextField getTtell() {
        return ttell;
    }

    public void setTtell(TextField ttell) {
        this.ttell = ttell;
    }

    public Button getRegistrarse() {
        return registrarse;
    }

    public void setRegistrarse(Button registrarse) {
        this.registrarse = registrarse;
    }
    
    

    public Escenaapor1() {
        this.favor = new Label("por favor ingrese los datos pedidos para regsitarse");
        this.lnombre = new Label ("nombre");
        this.lapellido = new Label("apellido");
        this.lnombreent = new Label ("nombre de la entidad a la que pertenece");
        this.lcorreo = new Label ("correo electronico");
        this.ltell = new Label("telefono celular");
        this.tnombre = new TextField();
        this.tapellido = new TextField();
        this.tnombreent = new TextField();
        this.tcorreo = new TextField();
        this.ttell = new TextField();
        this.registrarse = new Button ("registrarse");
        VBox layout = new VBox();
        HBox l1 = new HBox();
        HBox l2 = new HBox();
        HBox l3 = new HBox();
        HBox l4 = new HBox();
        HBox l5 = new HBox();
        HBox l6 = new HBox();
        HBox l7 = new HBox();
        HBox esp1 = new HBox();
        
        l1.getChildren().add(favor);
        l2.getChildren().add(lnombre);
        l2.getChildren().add(tnombre);
        l3.getChildren().add(lapellido);
        l3.getChildren().add(tapellido);
        l4.getChildren().add(lnombreent);
        l4.getChildren().add(tnombreent);
        l5.getChildren().add(lcorreo);
        l5.getChildren().add(tcorreo);
        l6.getChildren().add(ltell);
        l6.getChildren().add(ttell);
        l7.getChildren().add(registrarse);
        layout.getChildren().add(l1);
        
        layout.getChildren().add(l2);
        layout.getChildren().add(l3);
        layout.getChildren().add(l4);
        layout.getChildren().add(l5);
        layout.getChildren().add(l6);
        layout.getChildren().add(l7);
        this.escena = new Scene (layout,600,600);
    }

    @Override
    public Scene getscene() {
        return this.escena;
    }
    
    
    
    
    
   
}
