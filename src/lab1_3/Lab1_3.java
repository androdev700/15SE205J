/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_3;

import java.util.Scanner;

/**
 *
 * @author ayushsingh
 */
public class Lab1_3 {
    
    public static class Another {
        String print() {
            Scanner s = new Scanner(System.in);
            String args = s.nextLine();
            return args;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Another a = new Another();
        System.out.print(a.print());
        
    }
    
}
