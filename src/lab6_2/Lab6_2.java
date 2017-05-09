/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Lab6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String\n");
        String data = scanner.next();
        System.out.println(alterString(data));
    }

    static String alterString(String data) {
        StringBuilder result = new StringBuilder();
        int length = data.length();
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for (int index = 0; index < length; ++index) {
            if (vowels.contains(data.charAt(index))) {
                result.append(data.charAt(index));
            } else {
                result.append(Character.toChars(data.charAt(index) + 1));
            }
        }
        return result.toString();
    }
}
