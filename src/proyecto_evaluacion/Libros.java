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
public class Libros extends Ejemplares {
    String autor;
    int añoPub;

    public Libros(String autor, int añoPub, String codIdentificativo, String titulo, String editorial, String tematica, int numPaginas, boolean disponible) {
        super(codIdentificativo, titulo, editorial, tematica, numPaginas, disponible);
        this.autor = autor;
        this.añoPub = añoPub;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPub() {
        return añoPub;
    }

    public void setAñoPub(int añoPub) {
        this.añoPub = añoPub;
    }
    
    
    
}
