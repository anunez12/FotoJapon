/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author anunez12
 */
public class Operaciones_Basicas_Con_Vectores {

    public static double promedio_vector(int[] lista) {
        double suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];

        }
        return suma / lista.length;
    }

    public static void main(String[] args) {
        int[] vector1 = {100, 200, 300, 234,100,100};

        System.out.println("El promedio alcanzado por los vectores asignados es igual a: " + promedio_vector(vector1));
        System.out.println("Las apariciones que presenta el vector es igual a: " + numero_de_apariciones(25, vector1));
        System.out.println("Las apariciones que presenta el vector es igual a: " + numero_de_apariciones(100, vector1));
    }
    //numero de apariciones de un elemento en un vector de enteros 

    public static int numero_de_apariciones(int elemento, int[] lista) {
        int cont = 0; // contador 

        for (int i = 0; i < lista.length; i++) {
            if (elemento == lista[i]) {

                cont++;
            }

        }
        return cont;                 
    }

}
