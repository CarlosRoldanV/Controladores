/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Carlos
 */
public abstract class Salvaje extends Animal implements Acciones{
    ////////////atributos\\\\\\\\\\\\\\
    private String clima;
    private String ubicacion;
    private int fuerza;
    private double precio;
    ////////getters\\\\\\\\\\\\\\\\

    public String getClima() {
        return clima;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getFuerza() {
        return fuerza;
    }

    public double getPrecio() {
        return precio;
    }
    //////////setters\\\\\\\\\\\

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   ////////////contructor\\\\\\\\\\

    public Salvaje() {
    }

    public Salvaje(int codigo, String nombre, int edad, double peso) {
        super(codigo, nombre, edad, peso);
    }

    public Salvaje(String clima, String ubicacion, int fuerza, double precio, int codigo, String nombre, int edad, double peso) {
        super(codigo, nombre, edad, peso);
        this.clima = clima;
        this.ubicacion = ubicacion;
        this.fuerza = fuerza;
        this.precio = precio;
    }

    public Salvaje(String clima, String ubicacion, int fuerza, double precio, String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        this.clima = clima;
        this.ubicacion = ubicacion;
        this.fuerza = fuerza;
        this.precio = precio;
    }
    
    ////////metodos\\\\\\\\\\\\\
 public boolean correr(){
     return true;
 }
    @Override
    public boolean nacer() {
      return true;
    }

    @Override
    public boolean morir() {
        return true;
    }
    //////tostring\\\\

    @Override
    public String toString() {
        return "Salvaje{" + "clima=" + clima + ", ubicacion=" + ubicacion + ", fuerza=" + fuerza + ", precio=" + precio + '}';
    }
   
}
