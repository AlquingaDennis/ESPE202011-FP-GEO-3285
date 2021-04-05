/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sort.controller;

/**
 *
 * @author Asus
 */
public class Sorting {
    public int[] sortByBubbleSort(int[] coins){
        int n = coins.length;
        
        int temp;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (coins[j] > coins[j + 1]) {
                    //swap
                    temp = coins[j];
                    coins[j] = coins[j + 1];
                    coins[j + 1] = temp;
                }
                System.out.print("sorting --> ");
               
            }
            System.out.println("");
        }
        return coins;
    }
    public int[] ortByBubbleSort(int[] coins){
        //CODE TO SORT
        
        return coins;
    }

    public String[] sortByBubbleSort(String[] coins) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
    

