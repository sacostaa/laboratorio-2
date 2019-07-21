/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.Controladorapor2.place;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static modelo.ArchivoDao.Proyectos;
import static modelo.ArchivoDao.aportantes;
import modelo.Dao;
import vista.Escenaapor3;

/**
 *
 * @author ASUS
 */
public class Controladorapor3 {
    
    private Escenaapor3 vista;
    private Dao modelo;
    double preciocambo = Proyectos.get(place).getPreciocamb();

    public Controladorapor3(String nombre, String montomin, String orientacion, String estado) {
        this.vista = new Escenaapor3(nombre,montomin,orientacion,estado); 
        vista.getAportar().setOnAction(new Eventoa());
        vista.getPasar().setOnAction(new Eventop());
        vista.getTerminar().setOnAction(new Eventot());
        
    }
    
    private class Eventoa 
      implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorapor3 controlador = new Controladorapor3(Proyectos.get(place).getNombre(),Double.toString(Proyectos.get(place).getPreciocamb()), Proyectos.get(place).getOrientacion(),Boolean.toString(false));
            int i ;
            for (i = 0;  i< aportantes.size(); i++) {
                
            }
            Proyectos.get(place).setAportante(aportantes.get(i-1));
            Proyectos.get(place).setEstado(false);
            Scene escena = controlador.getVista().getscene();
            stage.setTitle("Escena 3 aportante");
           stage.setScene(escena);
           stage.show();
            
        }
        
    }
    private class Eventot 
      implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            
            File f = new File("resulatdos.txt");
            File p = new File ("proyectos.txt");
            File a = new File("aportantes.txt");
            PrintStream salida = null;
            PrintStream salidap = null;
            PrintStream salidaa = null;
            
            try{
                           salidaa= new PrintStream(a);
                           }catch(IOException e){
                           System.out.println("esepcion");
                       }
         try{
                           salida = new PrintStream(f);
                           }catch(IOException e){
                           System.out.println("esepcion");
                       }
         
            for (int i = 0; i < Proyectos.size(); i++) {
                if (Proyectos.get(i).getAportante().getNombre().equals(" ")) {
                    salida.println(Proyectos.get(i).getNombre()+" "+"sincomprar");
                }else{
                    salida.println(Proyectos.get(i).getNombre()+" "+Proyectos.get(i).getPreciocamb()+" "+Proyectos.get(i).getAportante().getCorreo());
                }
            }
            try{
                           salidap = new PrintStream(p);
                           }catch(IOException e){
                           System.out.println("esepcion");
                       }
            
            for (int i = 0; i < Proyectos.size(); i++) {
                salidap.println(Proyectos.get(i).getNombre()+" "+Proyectos.get(i).getOrientacion()+" "+Double.toString(Proyectos.get(i).getMontomin())+" "+Boolean.toString(Proyectos.get(i).isEstado())+" "+Proyectos.get(i).getPromotor().getCorreo());
            }
            
            for (int i = 0; i < aportantes.size(); i++) {
                salidaa.println(aportantes.get(i).getNombre()+" "+aportantes.get(i).getApelldio()+" "+aportantes.get(i).getNombreent()+" "+aportantes.get(i).getCorreo()+" "+Integer.toString(aportantes.get(i).getNumero()));
            }
            
            Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           controladorescenafin controlador = new controladorescenafin();
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 3 aportante");
           stage.setScene(escena);
           stage.show();

         
        }
        
    }
    private class Eventop 
      implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           
           
           if(Proyectos.get(place).getPreciocamb()>Proyectos.get(place).getMontomin()) {
           Proyectos.get(place).setPreciocamb(Proyectos.get(place).getPreciocamb()-(preciocambo*5/100));
            Controladorapor3 controlador = new Controladorapor3(Proyectos.get(place).getNombre(),Double.toString(Proyectos.get(place).getPreciocamb()), Proyectos.get(place).getOrientacion(),Boolean.toString(true));
            Scene escena = controlador.getVista().getscene();
            stage.setTitle("Escena 3 aportante");
           stage.setScene(escena);
           stage.show();
           }else{
               System.out.println("el precio actual es el precio minimo");
               Controladorapor3 controlador = new Controladorapor3(Proyectos.get(place).getNombre(),Double.toString(Proyectos.get(place).getPreciocamb()), Proyectos.get(place).getOrientacion(),Boolean.toString(true));
            Scene escena = controlador.getVista().getscene();
            stage.setTitle("Escena 3 aportante");
           stage.setScene(escena);
           stage.show();
           }
        }
        
    }
    
    

    public Escenaapor3 getVista() {
        return vista;
    }

    public void setVista(Escenaapor3 vista) {
        this.vista = vista;
    }
    
    
    
}
