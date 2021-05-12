/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_evaluacion;

import java.util.HashMap;

/**
 *
 * @author CES
 */
public class Catalogo {
    private HashMap<String,Ejemplares> ejemplares = new HashMap<>();
    public boolean insertarEjemplar (Ejemplares ejemplares){
        if (ejemplares!= null && !ejemplares.containsKey(ejemplares.getCodIdentificativo())) {
            ejemplares.put(ejemplares.getCodIdentificativo(), ejemplares);
            return true;
            
        }
    return false;
    }
    
}
