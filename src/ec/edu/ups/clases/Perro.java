/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Byron PC
 */
public class Perro extends Domestico implements Acciones {
    private String raza;
    private String pelaje;
    private String color;
    public Perro(){
    
    }
    public String getRaza() {
        return raza;
    }
    public String getPelaje(){
        return pelaje;
    }
    public String getColor() {
        return color;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Perro(int codigo, String nombre, int edad, double peso, String sexo) {
        super(codigo, nombre, edad, peso, sexo);
    }
   
    public Perro(String raza, String pelaje, String color, int codigo, String nombre, int edad, double peso, String sexo) {
        super(codigo, nombre, edad, peso, sexo);
        this.raza = raza;
        this.pelaje = pelaje;
        this.color = color;
    }

    public Perro(String raza, String pelaje, String color) {
        this.raza = raza;
        this.pelaje = pelaje;
        this.color = color;
    }
    
    

    @Override //Sobbreescritura de metodos Polimorfismo
    public void comer() {
        System.out.println("Clase Perro: ");
        System.out.println("\t El perro "+this.getNombre()+" tiene codigo " + this.getCodigo());
        System.out.println("\t " + this.getNombre() + " està comiendo"); //Hereda de animal e implementa acciones

    }

    @Override
    public void dormir() {
        System.out.println("\t " + this.getNombre() +" tiene " + this.getEdad() + " año");
    }

    @Override
    public void moverse() {
        System.out.println("\t " + this.getNombre() +" pesa " + this.getPeso() + " kilos");
    }

    @Override
    public void jugar() {
        System.out.println("\t " + this.getNombre() +" juega mucho porque tiene " + this.getEdad() + " año");
    }

    @Override
    public void reproducirse() {
        System.out.println("\t " + this.getNombre() +" se reproduce diferente porque es " + this.getSexo());
    }

}
