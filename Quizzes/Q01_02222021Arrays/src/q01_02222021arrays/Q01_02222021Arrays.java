/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q01_02222021arrays;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Q01_02222021Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalstudents =0;
        String[] students;
        float[] averages;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students you want ->");
        totalstudents = scanner.nextInt();
        
        students = new String[totalstudents];
        averages = new float[totalstudents];
        
        for (int i= 0; i < totalstudents; i++) {
            scanner.nextLine();
            System.out.print("Enter the student's name #" + i + "-> ");
            students[i] = scanner.nextLine();
            System.out.print("Please enter " + students[i] + " averages ->");
            averages[i] = scanner.nextFloat();
        }
        
        System.out.println(" students -> \t    averages  ");
        
        for (int i = 0; i < totalstudents; i++) {
            System.out.println(students[i] + "-> \t " + totalstudents);
        }
  
    }
}
