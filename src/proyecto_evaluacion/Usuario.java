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
public class Usuario {
    String nif;
    String nombre;
    String apellidos;
    String eMail;
    String numTelf;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNumTelf() {
        return numTelf;
    }

    public void setNumTelf(String numTelf) {
        this.numTelf = numTelf;
    }

    public Usuario(String nif, String nombre, String apellidos, String eMail, String numTelf) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.eMail = eMail;
        this.numTelf = numTelf;
    }
    
}
