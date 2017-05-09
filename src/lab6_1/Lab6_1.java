/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_1;

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Lab6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String\n");
        String data = scanner.next();
        System.out.println(getImage(data));
    }

    static String getImage(String data) {
        StringBuffer buffer = new StringBuffer(data);
        return data.concat("|").concat(buffer.reverse().toString());
    }
}
