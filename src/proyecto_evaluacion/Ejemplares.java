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
public class Ejemplares {
    String codIdentificativo;
    String titulo, editorial, tematica;
    int numPaginas;
    boolean disponible;

    public Ejemplares(String codIdentificativo, String titulo, String editorial, String tematica, int numPaginas, boolean disponible) {
        this.codIdentificativo = codIdentificativo;
        this.titulo = titulo;
        this.editorial = editorial;
        this.tematica = tematica;
        this.numPaginas = numPaginas;
        this.disponible = disponible;
    }

    public String getCodIdentificativo() {
        return codIdentificativo;
    }

    public void setCodIdentificativo(String codIdentificativo) {
        this.codIdentificativo = codIdentificativo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}
