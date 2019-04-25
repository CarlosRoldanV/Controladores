/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Mono;
import ec.edu.ups.clases.Perro;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carlos
 */
public class ControladorMono {
    
    private Set<Mono> lista;
    private int codigo;
    // Constructor
    public ControladorMono() {
        lista = new HashSet<>();
        codigo = 0;
    }
    // Creacion del objeto tipo Ave
    public void create(Mono objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    // Leer el objeto tipo Ave
    public Mono read(int codigo) {
        for (Mono mono : lista) {
            if (mono.getCodigo() == codigo) {
                return mono;
            }
        }
        return null;
    }
    // Modificacion del objeto tipo Ave
    public void update(Mono objeto) {
        for (Mono mono : lista) {
           
            if(mono.equals(objeto)){
                lista.remove(mono);
                lista.add(objeto);
                break;
            }
        }
    }
    // Eliminacion del objeto tipo Ave
    public void delet(int codigo) {
        for (Mono mono : lista) {
           
            if(mono.getCodigo()== codigo){
                lista.remove(mono);
                break;
            }
        }
    }
    // Listar los objetos tipo Ave
    public void lista (){
        for (Mono mono : lista) {
            System.out.println(mono);
        }
    }
    // Metodo extra para mostrar por pantalla los codigos de los objetos
    public void codigo(){
       for (Mono mono: lista) {
            System.out.println(mono.getCodigo()+". "+mono.getNombre());
        } 
    }
}
