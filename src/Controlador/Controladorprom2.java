/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.Dao;
import vista.Escenaapor2;
import vista.Escenapro2;

/**
 *
 * @author ASUS
 */
public class Controladorprom2 {
    private Escenapro2  vista;
    private Dao modelo;
    
     public Escenapro2 getVista() {
        return vista;
    }

    public Controladorprom2() {
        this.vista = new Escenapro2();
        
    }
    
}
