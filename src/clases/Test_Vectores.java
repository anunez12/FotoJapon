/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author anunez12
 */
public class Test_Vectores {

    public static void main(String[] args) {

        //Arreglo: es el que se encarga de modelar una lista de datos
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("La suma de estos numeros es: " + (numero1 + numero2));

        int[] lista_enteros = new int[20]; 
        ArrayList<Integer> listadinamica = new ArrayList<>();      

        System.out.println("El arreglo posee" + Arrays.toString(lista_enteros) + ": 20 elementos "); 
        System.out.println("El arreglo dinamico es igual a: " +listadinamica); 
        

        lista_enteros[0] = 100;
        lista_enteros[19] = 200; 
        listadinamica.add(2500); 
        listadinamica.add(300);

        System.out.println("El arreglo posee" + Arrays.toString(lista_enteros) + ": 20 elementos ");
        System.out.println("La suma de estos vectores es igual: " + (lista_enteros[0] + lista_enteros[19]));
        System.out.println("El arreglo dinamico es igual a: " +listadinamica);            
        
       
        int suma = 0;

        for (int i = 0; i < lista_enteros.length; i++) { 
            System.out.println("i:"+i+"listaenteros[i]"+lista_enteros[i]); 
            suma += lista_enteros[i];     
            
            

        }
        System.out.println("La suma de n° vectores es igual a :" +suma); 
    }

}
