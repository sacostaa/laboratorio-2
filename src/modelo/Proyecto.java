/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Proyecto {
    private String nombre;
    private String orientacion;
    private double montomin;
    private boolean estado;
    private Aportante aportante;
    private Promotor promotor;
    private double preciocamb;

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public double getMontomin() {
        return montomin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public void setMontomin(double montomin) {
        this.montomin = montomin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Aportante getAportante() {
        return aportante;
    }

    public void setAportante(Aportante aportante) {
        this.aportante = aportante;
    }

    public Promotor getPromotor() {
        return promotor;
    }

    public void setPromotor(Promotor promotor) {
        this.promotor = promotor;
    }

    public Proyecto(String nombre, String orientacion, double montomin, boolean estado, Promotor promotor,double preciocamb) {
        this.nombre = nombre;
        this.orientacion = orientacion;
        this.montomin = montomin;
        this.estado = estado;
        this.promotor = promotor;
        this.aportante = new Aportante(" "," "," "," ",1234);
        this.preciocamb = preciocamb;
        
    }

    public double getPreciocamb() {
        return preciocamb;
    }

    public void setPreciocamb(double preciocamb) {
        this.preciocamb = preciocamb;
    }
    
    

    public Proyecto(String nombre, String orientacion, double montomin, boolean estado, Aportante aportante, Promotor promotor, double preciocamb) {
        this.nombre = nombre;
        this.orientacion = orientacion;
        this.montomin = montomin;
        this.estado = estado;
        this.aportante = aportante;
        this.promotor = promotor;
    }

    
    

    
    
    
    
}
