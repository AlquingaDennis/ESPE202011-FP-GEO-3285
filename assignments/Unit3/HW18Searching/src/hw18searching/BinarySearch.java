/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class BinarySearch {
    public static void binary(String[] args) {
        int num[]={75,2,44,56,66,83,90,23,66};
        int posicion, buscar=83;
 
        // Buscamos la posicion del primer valor
        // Si el array no esta ordenado nos puede dar un valor erroneo
        posicion=Arrays.binarySearch(num, buscar);
        System.out.println("Array no ordenado. Encontrado en el indice: "+posicion);
 
        // Ordenamos el array
        Arrays.sort(num);
 
        // Buscamos la posicion del primer valor
        posicion=Arrays.binarySearch(num, buscar);
        System.out.println("Array ordenado. Encontrado en el indice: "+posicion);
    }
}
    

