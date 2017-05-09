/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1;

import java.util.Scanner;

/**
 *
 * @author ayushsingh
 */
public class Lab2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Equation -- >> ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double d = 0;
        d = ( b*b - 4*a*c );
        d = Math.sqrt(d);
        
        if (d > 0) {
            System.out.print("Root 1 : " + (-b + d)/(2*a));
            System.out.print("Root 2 : " + (-b - d)/(2*a));
            
        } else {
            System.out.print("No Real Roots found!!");
        }   
    }   
}