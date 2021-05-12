/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_evaluacion;

/**
 *
 * @author CES
 */
public class Revistas extends Ejemplares {
     int numFascisulo;
    String fechaPub;

    public Revistas(int numFascisulo, String fechaPub, String codIdentificativo, String titulo, String editorial, String tematica, int numPaginas, boolean disponible) {
        super(codIdentificativo, titulo, editorial, tematica, numPaginas, disponible);
        this.numFascisulo = numFascisulo;
        this.fechaPub = fechaPub;
    }

    public int getNumFascisulo() {
        return numFascisulo;
    }

    public void setNumFascisulo(int numFascisulo) {
        this.numFascisulo = numFascisulo;
    }

    public String getFechaPub() {
        return fechaPub;
    }

    public void setFechaPub(String fechaPub) {
        this.fechaPub = fechaPub;
    }
   
    
    
}
