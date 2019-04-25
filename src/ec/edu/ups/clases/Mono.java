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
public final class Mono extends Salvaje implements Acciones{
  private String habilidad;
private int altura;
private String habitat;
private String actitud;

///////////////getters\\\\\\\\\\\\\\\\\\\\\

    public String getHabilidad() {
        return habilidad;
    }

    public int getAltura() {
        return altura;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getActitud() {
        return actitud;
    }
////////////////////settters\\\\\\\\\\\\\

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setActitud(String actitud) {
        this.actitud = actitud;
    }
    /////////constructor\\\\\\\\\\\\

    public Mono() {
    }

    public Mono(String habilidad, int altura, String habitat, String actitud, String clima, String ubicacion, int fuerza, double precio, int codigo, String nombre, int edad, double peso) {
        super(clima, ubicacion, fuerza, precio, codigo, nombre, edad, peso);
        this.habilidad = habilidad;
        this.altura = altura;
        this.habitat = habitat;
        this.actitud = actitud;
    }

    public Mono(String habilidad, int altura, String habitat, String actitud, String clima, String ubicacion, int fuerza, double precio, String nombre, int edad, double peso) {
        super(clima, ubicacion, fuerza, precio, nombre, edad, peso);
        this.habilidad = habilidad;
        this.altura = altura;
        this.habitat = habitat;
        this.actitud = actitud;
    }
    

           //////////////////metodos\\\\\\\\\\\\\\\\
    public boolean saltar(){
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
    //////////////////////////tostring\\\\\\\\\\\

    @Override
    public String toString() {
        return "Mono{" + "habilidad=" + habilidad + ", altura=" + altura + ", habitat=" + habitat + ", actitud=" + actitud + '}';
    }
    
    }
    


