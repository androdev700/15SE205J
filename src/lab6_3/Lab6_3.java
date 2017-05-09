/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Lab6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String S1\n");
        String S1 = scanner.next();
        System.out.print("Enter a String S2\n");
        String S2 = scanner.next();
        for (String e : modifyString(S1, S2)) {
            System.out.println(e);
        }
    }

    static ArrayList<String> modifyString(String S1, String S2) {
        ArrayList<String> strings = new ArrayList<>();

        // Operation 1
        int length = S1.length();
        StringBuilder s1 = new StringBuilder();
        for (int index = 0; index < length; ++index) {
            if (index % 2 == 0) {
                s1.append(S2);
            } else {
                s1.append(S1.charAt(index));
            }
        }
        strings.add(s1.toString());

        //Operation 2
        int memLastIndex = 0;
        int lastIndex = 0;
        int count = 0;
        StringBuilder temp = new StringBuilder(S1);
        StringBuilder tempS2 = new StringBuilder(S2);
        while (lastIndex != -1) {
            memLastIndex = lastIndex = S1.indexOf(S2, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += S2.length();
            }
        }
        if (count > 1) {
            strings.add(temp.replace(memLastIndex, S2.length(), tempS2.reverse().toString()).toString());
        } else {
            strings.add(S1.concat(S2));
        }

        //Operation 3
        //Operation 4
        int divide = (int) Math.ceil((double) S2.length() / 2);
        strings.add(S2.substring(0, divide).concat(S1).concat(S2.substring(divide)));

        //returning the ArrayList
        return strings;
    }

}
