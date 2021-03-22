/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int num[]={8,2,4,6,16,31,10,3,6};
        int position, search=2;
 
        // We look for the position of the first value
        // If the array is not ordered it can give us a wrong value
        position=Arrays.binarySearch(num, search);
        System.out.println("Unordered array. Found in the index: "+position);
 
       // We order the array
        Arrays.sort(num);
 
      // We look for the position of the first value
        position=Arrays.binarySearch(num, search);
        System.out.println("Ordered array. Found in the index: "+position);
    }
}
