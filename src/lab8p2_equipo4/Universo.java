/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo4;

import java.util.ArrayList;

/**
 *
 * @author Gabriela Montes
 */
public class Universo {
    private String nombre;
    private String cantidad;
    private ArrayList <Servivo> seres=new ArrayList();

    public Universo(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    

    public Universo() {
    }


    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Servivo> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<Servivo> seres) {
        this.seres = seres;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
