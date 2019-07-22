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
import static modelo.ArchivoDao.Proyectos;
import static modelo.ArchivoDao.promotores;
import modelo.Dao;
import modelo.Promotor;
import modelo.Proyecto;
import vista.Escenaapor1;
import vista.Escenapro1;

/**
 *
 * @author ASUS
 */
public class Controladorprom1 {
    private Escenapro1 escena;
    private Dao modelo;

    public Escenapro1 getVista() {
        return escena;
    }

    
    public Controladorprom1() {
      this.escena = 
              new Escenapro1(" "," ");
      this.escena.getRegistrarse().setOnAction(new Evento1 ());
      
    }
    private String revisar(String nombre)throws NombreException{
        
        for (int i = 0; i < Proyectos.size(); i++) {
            if(Proyectos.get(i).getNombre().equals(nombre)){
                throw new NombreException("nomnbre repetido");
            }
        }
        return "se pudo agregar";
    }
    
    private class Evento1 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
            try{
            try{
           Controladorprom1 controladorre = new Controladorprom1();
                
                    
                
            String nombre = escena.getTnombre().getText(); 
            String apellido = escena.getTapellido().getText();
            int tell = Integer.parseInt(escena.getTtell().getText());
            String correo = escena.getTcorreo().getText();
            Promotor prom = new Promotor(nombre,apellido,correo,tell);
            promotores.add(prom);
            int montomin = Integer.parseInt(escena.getTmontomin().getText());
            boolean estado = true;
            String nombreproyecto = escena.getTnombrepro().getText();
            controladorre.revisar(nombreproyecto);
            if(escena.getEmpre().isSelected()==true){
                Proyectos.add(new Proyecto(nombreproyecto,"empresarial",montomin,estado,prom,montomin+(montomin*20/100)));
                
            }
            
            if(escena.getArt().isSelected()==true){
                Proyectos.add(new Proyecto(nombreproyecto,"artistico",montomin,estado,prom,montomin+(montomin*20/100)));
            }
            
            if (escena.getCient().isSelected()==true) {
               Proyectos.add(new Proyecto(nombreproyecto,"cientifico",montomin,estado,prom,montomin+(montomin*20/100)));
           }
            
            if (escena.getCult().isSelected()==true) {
                Proyectos.add(new Proyecto(nombreproyecto,"cultural",montomin,estado,prom,montomin+(montomin*20/100)));
            }
           
            
            
            Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           
           Controladorprom2 controlador = new Controladorprom2();
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 2 promotor");
           stage.setScene(escena);
           stage.show();
            }catch(NumberFormatException ex){
                /*
           Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorprom1 controlador = new Controladorprom1();
          controlador.getVista().getRegistrarse().setOnAction(new Evento2 ());
           controlador.setEscena(new Escenapro1(" ","solo se pueden ingresar numeros"));
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 1 aportante");
           stage.setScene(escena);
           stage.show();
          
                */
                System.out.println("solo ingrese numeros cuando se le pidan alguno");
            }
   
         }catch(NombreException exn){
             /*
             Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorprom1 controlador = new Controladorprom1();
           controlador.getVista().getRegistrarse().setOnAction(new Evento2 ());
           controlador.setEscena(new Escenapro1("el nombre del proyecto ya existe ",""));
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 1 aportante");
           stage.setScene(escena);
           stage.show();
           */
             
                System.out.println("nombre de proyecto repetido");
         } 
        }
    
}
    private class Evento2 
      implements EventHandler<ActionEvent>{
       @Override
        public void handle(ActionEvent event) {
            try{
            try{
           Controladorprom1 controladorre = new Controladorprom1();
                
                    
                
            String nombre = escena.getTnombre().getText(); 
            String apellido = escena.getTapellido().getText();
            int tell = Integer.parseInt(escena.getTtell().getText());
            String correo = escena.getTcorreo().getText();
            Promotor prom = new Promotor(nombre,apellido,correo,tell);
            promotores.add(prom);
            int montomin = Integer.parseInt(escena.getTmontomin().getText());
            boolean estado = true;
            String nombreproyecto = escena.getTnombrepro().getText();
            controladorre.revisar(nombreproyecto);
            if(escena.getEmpre().isSelected()==true){
                Proyectos.add(new Proyecto(nombreproyecto,"empresarial",montomin,estado,prom,montomin+(montomin*20/100)));
                
            }
            
            if(escena.getArt().isSelected()==true){
                Proyectos.add(new Proyecto(nombreproyecto,"artistico",montomin,estado,prom,montomin+(montomin*20/100)));
            }
            
            if (escena.getCient().isSelected()==true) {
               Proyectos.add(new Proyecto(nombreproyecto,"cientifico",montomin,estado,prom,montomin+(montomin*20/100)));
           }
            
            if (escena.getCult().isSelected()==true) {
                Proyectos.add(new Proyecto(nombreproyecto,"cultural",montomin,estado,prom,montomin+(montomin*20/100)));
            }
           
            
            
            Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           
           Controladorprom2 controlador = new Controladorprom2();
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 2 promotor");
           stage.setScene(escena);
           stage.show();
            }catch(NumberFormatException ex){
                
           Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorprom1 controlador = new Controladorprom1();
          controlador.getVista().getRegistrarse().setOnAction(new Evento1 ());
           controlador.setEscena(new Escenapro1(" ","solo se pueden ingresar numeros"));
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 1 aportante");
           stage.setScene(escena);
           stage.show();
          
                
            }
   
         }catch(NombreException exn){
             Singleton singleton=Singleton.getSingleton();
           Stage stage = singleton.getStage();
           Controladorprom1 controlador = new Controladorprom1();
           controlador.getVista().getRegistrarse().setOnAction(new Evento1 ());
           controlador.setEscena(new Escenapro1("el nombre del proyecto ya existe ",""));
           Scene escena = controlador.getVista().getscene();
           stage.setTitle("Escena 1 aportante");
           stage.setScene(escena);
           stage.show();
           
         } 
        }
    
}


    public Escenapro1 getEscena() {
        return escena;
    }

    public void setEscena(Escenapro1 escena) {
        this.escena = escena;
    }

    public Dao getModelo() {
        return modelo;
    }

    public void setModelo(Dao modelo) {
        this.modelo = modelo;
    }
    
    
    
}
