/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FileManager {
    public static boolean createFile(String fileMark) {
        boolean created = false;
        try {
            File file = new File(fileMark + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileMark) {
        boolean saved = false;

        createFile(fileMark);

        try {
            FileWriter myWrite = new FileWriter(fileMark+ ".csv", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileMark + " was saved");
            saved = true;

        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    }
    

    
    public static String  read(String fileName){
        String text = " ";
        try {
            Scanner s = new Scanner(new File(fileName));
            while (s.hasNextLine()) { 
                text = text + s.nextLine()+ "\n";
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        
        return text;       
    }
}
    
    

