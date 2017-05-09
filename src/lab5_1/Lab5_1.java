/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_1;

/**
 *
 * @author andro
 */
class Test {

    int i;

    Test(int i) {
        this.i = i;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.print("Inside Finalize" + i);
        super.finalize();
    }
}

public class Lab5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // TODO code application logic here
            Test t = new Test(10);
            Test t1 = new Test(20);
            //t.finalize();
            //We can call finalize method like object.finalize() or use Runtime.runFinalizersOnExit(true) which will run finalize on all the objects
            //Runtime.runFinalizersOnExit(true);
            //Show Garbage Collector
            t1 = t;
            //garbage collector will run finalize of t as it is abandoned now
            System.gc( );
            System.out.println(t1.i);

        } catch (Throwable ex) {

        }
    }

}
