/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Objects;   

/**
 *
 * @author anunez12
 */
public class Etiqueta {

    private int numfotos;//numero de fotos 
    private String nombre;
    private Usuario usuario;

    public Etiqueta(String nombre, Usuario usuario) {

        this.nombre = nombre;
        this.usuario = usuario;
    }

    public int getNumfotos() {
        return numfotos;
    }

    public void setNumfotos(int numfotos) {
        this.numfotos = numfotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Etiqueta{" + "numfotos=" + numfotos + ", nombre=" + nombre + ", usuario=" + usuario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.numfotos;
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etiqueta other = (Etiqueta) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
  
}
