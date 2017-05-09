/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_4;

import java.util.Scanner;
import lab1_1.Lab1_1;

/**
 *
 * @author ayushsingh
 */
public class Lab1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lab1_1 ob = new Lab1_1();
        ob.print();
        
        
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println("In Hex " + Integer.toHexString(number));
        System.out.println("In Oct " + Integer.toOctalString(number));
        System.out.println("In Bin " + Integer.toBinaryString(number));
        
    }
    
}
