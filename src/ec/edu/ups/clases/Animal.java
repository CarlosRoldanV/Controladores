/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;



/**
 *
 * @author Carlos
 */
public class Animal implements Comparable<Animal>{
    private int codigo;
    private String nombre;
    private int edad;
    private double peso;
    

    
    public Animal() {
       
    }

    public Animal(int codigo, String nombre, int edad, double peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

    public boolean comer(){
     return  true;
    }
     public boolean dormir(){
     return  true;
    }
     @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso +'}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Animal o) {
        if (nombre.compareTo(o.getNombre()) >=1 ){
            return 1;
            
        }else if (nombre.compareTo(o.getNombre())<=-1){
            return -1;
            
        }else{
           return 0;
        }
    }

    

}
