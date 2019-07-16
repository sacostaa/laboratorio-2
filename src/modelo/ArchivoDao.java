/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ASUS
 */
public class ArchivoDao implements Dao{
    
    static public ArrayList<Proyecto> Proyectos;
    static public ArrayList<Promotor> promotores;
    static public ArrayList <Aportante> aportantes;

    @Override
    public void guardarproyecto() { 
        Proyectos = new ArrayList<Proyecto>(); 
        promotores = new ArrayList<Promotor>(); 
        aportantes = new ArrayList<Aportante>(); 
        
        String id;
        String orientacion;
        double preciomin;
        boolean estado;
        String correoaport;
        String correopromotor;
        String nombreapor;
        String apellidoapor;
        String nombreent;
        String acorreoaport;
        int numaport;
        String nombrepro;
        String apellidopro;
        String pcorreopromotor;
        int numpromotor;
        File p = new File("proyectos.txt");
        File pro = new File("promotores.txt");
        File apor = new File("aportantes.txt");
        
        if(apor.exists()){
        try{
            String datosapor [];
          Scanner scapor = new Scanner(apor);
          while(scapor.hasNextLine()){
              datosapor = scapor.nextLine().split(" ");
              nombreapor = datosapor[0];
              apellidoapor = datosapor [1];
              nombreent = datosapor[2];
              acorreoaport = datosapor[3];
              numaport = Integer.parseInt(datosapor[4]);
              aportantes.add(new Aportante(nombreapor,apellidoapor,nombreent,acorreoaport,numaport));
          }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        if(pro.exists()){
        try{
            String datospro [];
          Scanner scpro = new Scanner(pro);
          while(scpro.hasNextLine()){
              datospro = scpro.nextLine().split(" ");
              nombrepro = datospro[0];
              apellidopro = datospro[1];
              pcorreopromotor = datospro[2];
              numpromotor = Integer.parseInt(datospro[3]);
              promotores.add(new Promotor(nombrepro,apellidopro,pcorreopromotor,numpromotor));
          }
          
        }catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if(p.exists()){
        try{
            Scanner scp = new Scanner(p);
          String datosp [];
          while(scp.hasNextLine()){
          datosp = scp.nextLine().split(" ");
          if(datosp.length == 5){
             id = datosp[0];
          orientacion = datosp[1];
          preciomin = Double.parseDouble(datosp[2]);
          estado = Boolean.parseBoolean(datosp[3]);
          correopromotor = datosp[4];
              for (int i = 0; i < promotores.size(); i++) {
                  if (promotores.get(i).getCorreo().equals(correopromotor)) {
                      Proyectos.add(new Proyecto(id,orientacion,preciomin,estado,promotores.get(i),preciomin+(preciomin*20/100)));
                      
                  }
              }
          }
          
          
          if(datosp.length == 6){
             id = datosp[0];
          orientacion = datosp[1];
          preciomin = Double.parseDouble(datosp[2]);
          estado = Boolean.parseBoolean(datosp[3]);
          correopromotor = datosp[4];
          correoaport = datosp[5];
          
              for (int i = 0; i < promotores.size(); i++) {
                  for (int j = 0; j < aportantes.size(); j++) {
                      
                  
                  if (promotores.get(i).getCorreo().equals(correopromotor)&& aportantes.get(j).getCorreo().equals(correoaport)) {
                       Proyectos.add(new Proyecto(id,orientacion,preciomin,estado,aportantes.get(j),promotores.get(i),preciomin+(preciomin*20/100)));
                  }
                  }
              }
          
          }
          
          
          }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        for (int i = 0; i <Proyectos.size(); i++) {
            System.out.println(Proyectos.get(i).getAportante().getApelldio());
        }
    }

    @Override
    public void leerproyectos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   

    
    
    
}
