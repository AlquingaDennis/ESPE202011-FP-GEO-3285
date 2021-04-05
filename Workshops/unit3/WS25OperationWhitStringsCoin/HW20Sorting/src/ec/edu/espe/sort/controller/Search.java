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
public class Search {
     public int findCoins(String[] typeCoins, String searchCoins ) {
        for (int i = 0; i < 6; i++) {
            if (searchCoins.equals(typeCoins[i])) {
                return 1;
            }
        }
        return -1;

    }
}

