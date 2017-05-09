/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_1;

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Lab3_1 {
    
    static Scanner s = new Scanner (System.in); 
    
    public static class Student {
        int registerationNumber;
        String yearOfStudy;
        String section;
        double cgpa;
        long expenses;
        int totalStudents;
        long allStudents;
        
        void getData() {
            System.out.println("Enter your details");
            System.out.println("Enter Your Registeration Number");
            registerationNumber = s.nextInt();
            System.out.println("Enter Your Year of Study");
            yearOfStudy = s.next();
            System.out.println("Enter Your Section");
            section = s.next();
            System.out.println("Enter Your GPA");
            cgpa = s.nextDouble();
            System.out.println("Enter Your Expenses for 4 Years");
            expenses = s.nextLong();
            System.out.println("Enter Total no. of Students in your campus");
            totalStudents = s.nextInt();
            System.out.println("Enter Total no. of Students acroos all campus and disciplines");
            allStudents = s.nextLong();
        }
        
        void printData() {
            System.out.println("You are a student with Register Number " + 
                    registerationNumber + " and you belong to " + yearOfStudy + 
                    " and eligible for a scholarship of " + cgpa*1000 + 
                    " per year as your CGPA is " + cgpa + " and your total living "
                    + "expense is " + expenses + " Total number of students "
                    + "in your campus is " + totalStudents + " and across campus "
                    + " is " + allStudents + ".");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1. Student");
        System.out.println("2. Faculty");
        System.out.println("Enter Your Choice -- >> ");
        int choice = s.nextInt();
        if (choice == 1) {
            Student student = new Student();
            student.getData();
            student.printData();
        } else {
            System.out.println("Permission denied to enter details");
        }
    }
}