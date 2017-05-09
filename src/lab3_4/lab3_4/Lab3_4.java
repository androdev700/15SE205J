/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_4.lab3_4;
// Importing from other package

// import test1.Test2; is an error since class Test2 in package test1 is not public hence we cannot import it

import lab3_4.test.Test;

/**
 *
 * @author andro
 */
public class Lab3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Class Test from other package is usable since it's public
        Test t = new Test();
        
        
    }
    
    //this private function "func" cannot be accesed outside this package since it's private
    private void func() {
        
    }
    
    // this class can be used since it's public
    public class demo {
        
        
    }
    
}
