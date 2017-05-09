/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_5;

import java.util.Scanner;

/**
 *
 * @author ayushsingh
 */
public class Lab1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String studentName[] = new String[2];
        int studentMarks[][] = new int[2][2];
        int avgMarks[] = new int[2];
        int i = 1;
        int marks;
        Scanner s = new Scanner(System.in);
        while (i != 3) {
            System.out.println("Enter name of Student");
            studentName[i-1] = s.next();
            System.out.println("Enter marks of "+studentName[i-1]+" in Subject 1");
            marks = s.nextInt();
            if(marks >= 0 && marks <=100) 
                studentMarks[i-1][0] = marks;
            else {
                System.out.println("Input not Valid");
                continue;
            }
            System.out.println("Enter marks of "+studentName[i-1]+" in Subject 2");
            marks = s.nextInt();
            if(marks >= 0 && marks <=100)
                studentMarks[i-1][1] = marks;
            else {
                System.out.println("Input not Valid");
                continue;
            }
            avgMarks[i-1] = (studentMarks[i-1][0] + studentMarks[i-1][1])/2 ;
            i++;
        }
     
        if (avgMarks[1]>avgMarks[0]) {
            System.out.print(studentName[1]+ " has more marks than " + studentName[0]);
        } else {
            System.out.print(studentName[0]+ " has more marks than " + studentName[1]);
        }
        
    }
    
}
