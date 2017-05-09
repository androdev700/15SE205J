/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7a_2.lab7a_2;

import lab7a_2.readData.*;

/**
 *
 * @author andro
 */
public class Lab7a_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringValue stringValue = new StringValue();
        IntegerValue integerValue = new IntegerValue();
        DoubleValue doubleValue = new DoubleValue();
        //calling methods

        stringValue.readString();
        integerValue.readInteger();
        doubleValue.readDouble();
        
    }

}
