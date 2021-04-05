/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ConcessionarySystem.controlle;

import ec.edu.espe.ConcessionarySystem.model.Motorcycle;
import utils.FileManager;

/**
 *
 * @author Asus
 */
public class MotorcycleController {
    
    public void save(Motorcycle motorcycle){
        String data = motorcycle.getMark() + ";" + motorcycle.getColor() + ";" + motorcycle.getYear() + ";" + motorcycle.getRoute()+ ";" +motorcycle.getCost();
        FileManager.save(data, "motorcycles");
        
    }  
    public static String read() {
        String data;
        data = FileManager.read("motorcycles.csv");
        return data;        
    }
    
    
 }  
