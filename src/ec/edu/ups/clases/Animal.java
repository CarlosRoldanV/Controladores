/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;



/**
 *
 * @author Byron PC
 */
//Estoy trayendo la interface
public class Animal implements Comparable<Animal>{
    private int codigo;
    private String nombre;
    private int edad;
    private double peso;
    private String sexo;

    public Animal() {
       
    }

    public Animal(int codigo, String nombre, int edad, double peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", sexo=" + sexo + '}';
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
