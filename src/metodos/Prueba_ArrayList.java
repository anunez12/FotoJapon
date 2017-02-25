/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clases.Usuario;
import java.util.ArrayList;
/**
 *
 * @author SP
 */
public class Prueba_ArrayList { 
 
 public static void main(String[] args) { 
        //creacion//
        
        ArrayList<String> lista_de_cadena = new ArrayList<>(); 
        ArrayList<Integer> lista_de_enteros = new ArrayList<>(); 
        ArrayList<Double> lista_de_reales = new ArrayList<>(); 
        ArrayList<Usuario> lista_de_usuarios = new ArrayList<>();       
        
        //insercion// 
        
        lista_de_cadena.add("A"); 
        lista_de_cadena.add("B"); 
        lista_de_cadena.add("D"); 
        lista_de_cadena.add("E"); 
        
        System.out.println(""+lista_de_cadena);   
        lista_de_cadena.add(1,"C"); 
        System.out.println(""+lista_de_cadena);         
        lista_de_cadena.set(2,"J"); 
        System.out.println(""+lista_de_cadena);  //set: metodo para reemplazar el elemento en la posicion o el indice que se desee //  
        
        //eliminacion// 
        lista_de_cadena.add("D"); 
        System.out.println(""+lista_de_cadena);
        lista_de_cadena.remove("D"); // remove: metodo utilizado para eliminar
        System.out.println(""+lista_de_cadena);  
        lista_de_cadena.remove("Z");
        System.out.println(""+lista_de_cadena.remove("Z"));   
        
        //busqueda// 
        System.out.println("Index of D:"+lista_de_cadena.indexOf("D")); 
        System.out.println("LastIndexOf D:"+lista_de_cadena.lastIndexOf("A")); 
        System.out.println("Cadenas: "+lista_de_cadena.size());                     
        System.out.println("Contains D: "+lista_de_cadena.contains("D")); 
        System.out.println("Enteros: "+lista_de_enteros.size());  
        System.out.println("Posicion:"+lista_de_cadena.get(2));      
        
        for (int i = 0; i <lista_de_cadena.size(); i++) {
            String actual = lista_de_cadena.get(i); 
            System.out.println("i"+i+"-"+actual);            
            
        }
 }
}
