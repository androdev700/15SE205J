/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ayushsingh
 */
public class Lab2_2 {
    
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static Scanner s = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter Your Choice");
        System.out.println("1. Enter Element in the Array");
        System.out.println("2. Display Element in the Array");
        System.out.println("3. Search for an element in the Array");
        System.out.println("4. Sort the Array");
        int choice = s.nextInt();
        while (choice != 5) {
            switch (choice) {
            
            case 1: input();
                break;
            case 2: print();
                break;
            case 3: search();
                break;
            case 4: sort();
                break;
            default:
                break;     
            }  
        System.out.println("Enter Your Choice");
        choice = s.nextInt();
        }
    }
    
    static void input() {
        System.out.println ("Enter - 1 to stop input");
        System.out.println ("Enter a input -- >");
        int input = s.nextInt();
        while (input != -1) {
            list.add(input);
            System.out.println ("Enter a input -- >");
            input = s.nextInt();
        }
    }
    
    static void print() {
        if (list.isEmpty()) {
            System.out.println("List is Empty");
        } else { 
            for (int aList : list ) {
            System.out.print(aList + " ");
            }
        }
    }
    
    static void search() {
        System.out.println("Enter element to be searched");
        int item = s.nextInt();
        if( list.contains(item) ) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");   
        }
    }
    
    static void sort() {
        System.out.println("Sorted List -- >>");
        Collections.sort(list);
        for (int aList : list ) {
            System.out.print(aList + " ");
        }
    }
}