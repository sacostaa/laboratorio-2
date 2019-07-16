/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.Dao;
import vista.Escenaapor3;

/**
 *
 * @author ASUS
 */
public class Controladorapor3 {
    
    private Escenaapor3 vista;
    private Dao modelo;

    public Controladorapor3(String nombre, String montomin, String orientacion, String estado) {
        this.vista = new Escenaapor3(nombre,montomin,orientacion,estado); 
    }
    
    

    public Escenaapor3 getVista() {
        return vista;
    }

    public void setVista(Escenaapor3 vista) {
        this.vista = vista;
    }
    
    
    
}
