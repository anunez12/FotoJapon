/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clases.Etiqueta;
import clases.Foto;
import clases.Usuario;
/**
 *
 * @author SP
 */
public class Prueba_Clase_Foto { 
    
     public static void main(String[] args) { 
        
     Foto nuevaFoto = new Foto("foto1.jpg","foto","jpa",10,1000,"publico"); 
     Usuario nuevo_usuario = new Usuario("anunez12","12345","anunez12@cuc.edu.co");
     Etiqueta nuevaEtiqueta = new Etiqueta("Universidad de la costa", nuevo_usuario);
     nuevaFoto.adicionar_etiqueta(nuevaEtiqueta); 
     
        System.out.println("Foto"+nuevaFoto);                      
    }
    
}
    

