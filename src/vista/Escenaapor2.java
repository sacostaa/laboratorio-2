/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import modelo.ArchivoDao;
import static modelo.ArchivoDao.Proyectos;
import modelo.Proyecto;
/**
 *
 * @author ASUS
 */
public class Escenaapor2 implements Vista{
    private Scene escena;
    private TableView <Proyecto>tabla;
    private TableColumn id;
    private TableColumn clase;
    private TableColumn precioactual;
    private TableColumn estado;
    private TableColumn botonaport;
    private ArrayList <HBox> info;
    private ArrayList <RadioButton> botones;
    private Button seguir;
    private ToggleGroup grupo;

    public Escenaapor2() {
        VBox layout = new VBox();
        info = new ArrayList <HBox>();
         botones = new ArrayList <RadioButton>();
         seguir = new Button ("seguir");
         grupo = new ToggleGroup();
        for (int i = 0; i < Proyectos.size(); i++) {
            HBox liena = new HBox();
            Label nombre = new Label (Proyectos.get(i).getNombre());
            Label montomin = new Label(Double.toString(Proyectos.get(i).getPreciocamb()));
            Label orientacion = new Label (Proyectos.get(i).getOrientacion());
            Label estado = new Label (Boolean.toString(Proyectos.get(i).isEstado()));
            RadioButton boton = new RadioButton(Proyectos.get(i).getNombre());
            boton.setToggleGroup(grupo);
            Label espacio = new Label ("        ");
            Label espacio1 = new Label ("        ");
            Label espacio2 = new Label ("        ");
            Label espacio3 = new Label ("        ");
            liena.getChildren().add(nombre);
            liena.getChildren().add(espacio);
            liena.getChildren().add(montomin);
            liena.getChildren().add(espacio1);
            liena.getChildren().add(orientacion);
            liena.getChildren().add(espacio2);
            liena.getChildren().add(estado);
            liena.getChildren().add(espacio3);
            liena.getChildren().add(boton);
            botones.add(boton);
            info.add(liena);
            
            
        }
        
        
        for (int i = 0; i < info.size(); i++) {
            layout.getChildren().add(info.get(i));
        }
        
        HBox lineab = new HBox();
        lineab.getChildren().add(seguir);
        layout.getChildren().add(lineab);
      /* id = new TableColumn<Proyecto,String>("id") ;
       id.setMinWidth(100);
       id.setCellFactory(new PropertyValueFactory<>("nombre"));
       clase= new TableColumn<Proyecto,String>("clase") ;
       clase.setMinWidth(200);
      clase.setCellFactory(new PropertyValueFactory<>("orientacion"));
       precioactual = new TableColumn<Proyecto,Double>("precio de comienzo") ;
       precioactual.setMinWidth(200);
       precioactual.setCellFactory(new PropertyValueFactory<>("montomin"));
       estado = new TableColumn<Proyecto,Boolean>("estado") ;
       estado.setMinWidth(100);
       estado.setCellFactory(new PropertyValueFactory<>("estado"));
       tabla = new TableView();
       tabla.setItems(getproyectos());
       tabla.getColumns().addAll(id,clase,precioactual,estado);
       VBox layout = new VBox();
       layout.getChildren().add(tabla);
*/
       this.escena = new Scene (layout,600,600);
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }
    

    public TableView getTabla() {
        return tabla;
    }

    public void setTabla(TableView tabla) {
        this.tabla = tabla;
    }

    public TableColumn getId() {
        return id;
    }

    public void setId(TableColumn id) {
        this.id = id;
    }

    public TableColumn getTipo() {
        return clase;
    }

    public void setTipo(TableColumn tipo) {
        this.clase = tipo;
    }

    public TableColumn getPrecioactual() {
        return precioactual;
    }

    public void setPrecioactual(TableColumn precioactual) {
        this.precioactual = precioactual;
    }

    public TableColumn getEstado() {
        return estado;
    }

    public void setEstado(TableColumn estado) {
        this.estado = estado;
    }

    public TableColumn getBotonaport() {
        return botonaport;
    }

    public void setBotonaport(TableColumn botonaport) {
        this.botonaport = botonaport;
    }

    public ArrayList<HBox> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<HBox> info) {
        this.info = info;
    }

    public ArrayList<RadioButton> getBotones() {
        return botones;
    }

    public void setBotones(ArrayList<RadioButton> botones) {
        this.botones = botones;
    }

    public Button getSeguir() {
        return seguir;
    }

    public void setSeguir(Button seguir) {
        this.seguir = seguir;
    }
    
    
    
    
   public ObservableList<Proyecto> getproyectos(){
        ObservableList<Proyecto> proyectos = FXCollections.observableArrayList();
        for (int i = 0; i < Proyectos.size(); i++) {
            proyectos.add(Proyectos.get(i));
        }
        return proyectos;
    } 

    @Override
    public Scene getscene() {
        return this.escena;
    }
    
    
}
