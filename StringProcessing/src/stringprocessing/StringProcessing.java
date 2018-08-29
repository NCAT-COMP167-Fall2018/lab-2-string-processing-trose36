/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author owner
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] records = new String[100];
        
        try {
            Scanner reader = new Scanner(new File(args[0]));
            
            int currentIndex = 0;
            while(reader.hasNext()){
                String[] line = reader.nextLine().split(",");
                
                String firstName = line[0];
                String lastName = line[1];
                String gender = line [2];
                String age = line[3];
                String phoneNumber = line [4];
                String email = line[5];
                
                records[currentIndex] =String.format("%-20s%-20s%-20s%-20s%-20s%20s",firstName,lastName,gender,age,phoneNumber,email);
                 System.out.println(records[currentIndex]);
            }
          
            
        } catch (FileNotFoundException ex) {
           System.err.println("Input file not found");
        }
        
        
    }
    
    
    
    
    
}
