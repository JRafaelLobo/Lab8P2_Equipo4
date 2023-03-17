/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo4;

/**
 *
 * @author Gabriela Montes
 */
public class Servivo {
    private String codigo;
    private String nombre;
    private int poder;
    private int anios;
    private String universo;
    private String raza; 

    public Servivo(String codigo, String nombre, int poder, int anios, String universo, String raza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.poder = poder;
        this.anios = anios;
        this.universo = universo;
        this.raza = raza;
    }
    
    public Servivo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return  codigo + " " + nombre;
    }
    
}
