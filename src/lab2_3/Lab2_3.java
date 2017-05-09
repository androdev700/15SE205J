/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_3;

/**
 *
 * @author ayushsingh
 */
public class Lab2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = new int [] {1,4,5,7,8,11,14,15,18,19};
      
        //printing using for-each
        for (int e : arr) {
            if (e%2!= 0) {
                System.out.println("even number");
                continue;
            } else if(e%5 == 0) {
                System.out.println("Number divisible by 5");
                break;
            } else {
                System.out.println("odd number");
            } 
            System.out.println("2x" + e + " = " + 2*e);
        } 
    }
}
