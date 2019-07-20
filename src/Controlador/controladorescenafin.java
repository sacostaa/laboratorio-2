/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.Dao;
import vista.Escenaapor3;
import vista.Escenafin;
import vista.Escenapro1;

/**
 *
 * @author ASUS
 */
public class controladorescenafin {
    
     private Escenafin vista;
    private Dao modelo;
    
    public Escenafin getVista() {
        return vista;
    }

    public controladorescenafin() {
        this.vista = new Escenafin();
    }
    
    
    
}
