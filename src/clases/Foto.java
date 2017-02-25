/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;       

/**
 *
 * @author anunez12
 */
public class Foto {               

    private String url;//ruta 
    private String nombre_archivo;
    private String tipo_de_dato;//jpg 
    private long size; //tamaño 
    private long resolucion;
    private String permiso;
    private ArrayList<Etiqueta> etiquetas = new ArrayList<>();

    public Foto(String url, String nombre_archivo, String tipo_de_dato, long size, long resolucion, String permiso) {

        this.url = url;
        this.nombre_archivo = nombre_archivo;
        this.tipo_de_dato = tipo_de_dato;
        this.size = size;
        this.resolucion = resolucion;
        this.permiso = permiso;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public String getTipo_de_dato() {
        return tipo_de_dato;
    }

    public void setTipo_de_dato(String tipo_de_dato) {
        this.tipo_de_dato = tipo_de_dato;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getResolucion() {
        return resolucion;
    }

    public void setResolucion(long resolucion) {
        this.resolucion = resolucion;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    public ArrayList getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList etiquetas) {
        this.etiquetas = etiquetas;
    }

    @Override
    public String toString() {
        return "Foto{" + "url=" + url + ", nombre_archivo=" + nombre_archivo + ", tipo_de_dato=" + tipo_de_dato + ", size=" + size + ", resolucion=" + resolucion + ", permiso=" + permiso + ", etiquetas=" + etiquetas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.url);
        hash = 47 * hash + Objects.hashCode(this.nombre_archivo);
        hash = 47 * hash + Objects.hashCode(this.tipo_de_dato);
        hash = 47 * hash + (int) (this.size ^ (this.size >>> 32));
        hash = 47 * hash + (int) (this.resolucion ^ (this.resolucion >>> 32));
        hash = 47 * hash + Objects.hashCode(this.permiso);
        hash = 47 * hash + Objects.hashCode(this.etiquetas);
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
        final Foto other = (Foto) obj;
        return true;
    } 
    
     public void adicionar_etiqueta(Etiqueta nueva_etiqueta){ 
       etiquetas.add(nueva_etiqueta);                       
    } 
    public boolean buscar_etiqueta(Etiqueta nueva_etiqueta){ 
      return etiquetas.contains(nueva_etiqueta);                          
    } 
    public boolean eliminar_etiqueta(Etiqueta nueva_etiqueta){ 
      return etiquetas.remove(nueva_etiqueta);      
    }           

 
    }
     

