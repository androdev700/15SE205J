/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_3;

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Lab3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Season Name");
        String season = s.nextLine();
        switch (season) {
            case "December" :
            case "January" :
            case "Feburary" : System.out.println("Winter");
                break;
            case "March" :
            case "April" :   
            case "May" : System.out.println("Summer");
                break;
            case "June" :
            case "July" :
            case "August" : System.out.println("Spring");
                break;
            case "September" :
            case "October" :
            case "November" : System.out.println("Autumn");
                break;
            default : System.out.println("Enter correct season");    
        }
    
    }
    
}