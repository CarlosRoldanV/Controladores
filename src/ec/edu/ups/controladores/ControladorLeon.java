/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Leon;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Carlos
 */
public class ControladorLeon {
   private Map<Integer, Leon> lista;
    private int codigo;
    // Constructor
    public ControladorLeon() {
        lista = new HashMap<Integer, Leon>();
        codigo = 0;
    }
    // Creacion del objeto tipo NoVascular
    public void create(Leon objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);

    }
    // Leer el objeto tipo NoVascular
    public Leon read(int codigo) {
        return lista.get(codigo);
    }
    // Modificacion del objeto tipo NoVascular
    public void update(Leon objeto) {

        lista.remove(objeto.getCodigo());
        lista.put(objeto.getCodigo(), objeto);

    }
    // Eliminacion del objeto tipo NoVascular
    public void delet(int codigo) {
        lista.remove(codigo);

    }
    // Listar los objetos tipo NoVascular
    public void listar() {
        System.out.println(lista.values());
    }
    
    public void codigo(){
        int c = 0;
        int co = 0;
        Leon leon = new Leon();
        do {            
            c++;
            leon = lista.get(c);
            if (leon != null){
                co++;
                System.out.println(leon.getCodigo()+". "+leon.getNombre());              
            }
        } while (co != lista.size());
    }
    
}
