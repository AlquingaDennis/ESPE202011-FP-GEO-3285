/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Mouse.controlle;

import ec.edu.espe.Mouse.model.Mouse;
import utils.FileManager;

/**
 *
 * @author Asus
 */
public class MouseController {
    
    public void save(Mouse mouse){
        String data = mouse.getMark() + ";" + mouse.getColor() + ";" + mouse.getCost() + ";" + mouse.getWireless+ ";" +mouse.getErgonomic();
        FileManager.save(data, "mouses");
        
    }  
    public static String read() {
        String data;
        data = FileManager.read("mouses.csv");
        return data;        
    }
    
    
 }  

    

