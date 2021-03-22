/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String YYSP[]) throws IOException {
        int Array[] = {17, 82, 39, 43, 56};
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Linear Search  ----> ");
        System.out.print("");
        System.out.print("What number do you want to search: ");
        int num = Integer.parseInt(entrada.readLine());

        for (int i = 0; i < Array.length; i++) {
            if (num == Array[i]) {
                System.out.println("The number is in the array and is in the position " + i);
            }
        }
    }

}
