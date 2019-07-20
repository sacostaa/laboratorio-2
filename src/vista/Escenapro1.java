/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author ASUS
 */
public class Escenapro1 implements Vista{
    
    private Scene escena;
    private Label favor;
    private Label lnombre;
    private Label lapellido;
    private Label lnombrepro;
    private Label lcorreo;
    private Label ltell;
    private Label lmontomin;
    private TextField tmontomin;
    private TextField tnombre;
    private TextField tapellido;
    private TextField tnombrepro;
    private TextField tcorreo;
    private TextField ttell;
    private Button registrarse;
    private RadioButton cult;
    private RadioButton empre;
    private RadioButton art;
    private RadioButton cient;
    private Label pregunta;
    private Label advertencianombre;
    private Label advertencianumero1;
    private Label advertencianumero2;
            

    public Escenapro1(String advn, String advnum) {
        this.favor = new Label("por favor ingrese los datos pedidos para ingresar un nuevo proyecto");
        this.lnombre = new Label ("nombre");
        this.lapellido = new Label("apellido");
        this.lnombrepro = new Label ("nombre del proyecto");
        this.lcorreo = new Label ("correo electronico");
        this.ltell = new Label("telefono celular");
        this.advertencianombre = new Label(advn);
        this.advertencianumero1 = new Label (advnum);
        this.advertencianumero2 = new Label (advnum);
        this.tnombre = new TextField();
        this.tapellido = new TextField();
        this.tnombrepro = new TextField();
        this.tcorreo = new TextField();
        this.ttell = new TextField();
        this.registrarse = new Button ("registrar");
        this.pregunta = new Label("de que orientacion es el proyecto?");
        ToggleGroup grupo = new ToggleGroup();
        this.empre = new RadioButton ("empresarial");
        this.art = new RadioButton ("artistica");
        this.cient = new RadioButton ("cientifica");
        this.cult = new RadioButton ("cultural");
        this.lmontomin = new Label("monto minimo");
        this.cult.setToggleGroup(grupo);
        this.art.setToggleGroup(grupo);
        this.cient.setToggleGroup(grupo);
        this.cult.setToggleGroup(grupo);
        this.empre.setToggleGroup(grupo);
        this.tmontomin = new TextField();
        VBox layout = new VBox();
        HBox l1 = new HBox();
        HBox l2 = new HBox();
        HBox l3 = new HBox();
        HBox l4 = new HBox();
        HBox l5 = new HBox();
        HBox l6 = new HBox();
        HBox l7 = new HBox();
        HBox l8 = new HBox();
        HBox l9 = new HBox();
        
        l1.getChildren().add(favor);
        l2.getChildren().add(lnombre);
        l2.getChildren().add(tnombre);
        
        
        l3.getChildren().add(lapellido);
        l3.getChildren().add(tapellido);
        l4.getChildren().add(lnombrepro);
        l4.getChildren().add(tnombrepro);
        l4.getChildren().add(advertencianombre);
        l5.getChildren().add(lcorreo);
        l5.getChildren().add(tcorreo);
        l6.getChildren().add(ltell);
        l6.getChildren().add(ttell);
        l6.getChildren().add(advertencianumero1);
        l7.getChildren().add(pregunta);
        l7.getChildren().add(cult);
        l7.getChildren().add(cient);
        l7.getChildren().add(empre);
        l7.getChildren().add(art);
        l8.getChildren().add(registrarse);
        l9.getChildren().add(lmontomin);
        l9.getChildren().add(tmontomin);
        l9.getChildren().add(advertencianumero2);
        layout.getChildren().add(l1);
        
        layout.getChildren().add(l2);
        layout.getChildren().add(l3);
        layout.getChildren().add(l4);
        layout.getChildren().add(l5);
        layout.getChildren().add(l6);
        layout.getChildren().add(l9);
        layout.getChildren().add(l7);
        
        layout.getChildren().add(l8);
        this.escena = new Scene (layout,600,600);
        
    }

    public Label getLmontomin() {
        return lmontomin;
    }

    public void setLmontomin(Label lmontomin) {
        this.lmontomin = lmontomin;
    }

    public TextField getTmontomin() {
        return tmontomin;
    }

    public void setTmontomin(TextField tmontomin) {
        this.tmontomin = tmontomin;
    }

    public Label getPregunta() {
        return pregunta;
    }

    public void setPregunta(Label pregunta) {
        this.pregunta = pregunta;
    }
    
    

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

    public Label getLnombrepro() {
        return lnombrepro;
    }

    public void setLnombrepro(Label lnombreent) {
        this.lnombrepro = lnombreent;
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

    public TextField getTnombrepro() {
        return tnombrepro;
    }

    public void setTnombrepro(TextField tnombreent) {
        this.tnombrepro = tnombreent;
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

    public RadioButton getCult() {
        return cult;
    }

    public void setCult(RadioButton cult) {
        this.cult = cult;
    }

    public RadioButton getEmpre() {
        return empre;
    }

    public void setEmpre(RadioButton empre) {
        this.empre = empre;
    }

    public RadioButton getArt() {
        return art;
    }

    public void setArt(RadioButton art) {
        this.art = art;
    }

    public RadioButton getCient() {
        return cient;
    }

    public void setCient(RadioButton cient) {
        this.cient = cient;
    }
    
    

    @Override
    public Scene getscene() {
        return this.escena;
    }
    
}
