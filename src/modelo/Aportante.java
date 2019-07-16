/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
public class Aportante {
    
    private String nombre;
    private String apelldio;
    private String nombreent;
    private String correo;
    private int numero;

    public Aportante(String nombre, String apelldio, String nombreent, String correo, int numero) {
        this.nombre = nombre;
        this.apelldio = apelldio;
        this.nombreent = nombreent;
        this.correo = correo;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldio() {
        return apelldio;
    }

    public void setApelldio(String apelldio) {
        this.apelldio = apelldio;
    }

    public String getNombreent() {
        return nombreent;
    }

    public void setNombreent(String nombreent) {
        this.nombreent = nombreent;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
