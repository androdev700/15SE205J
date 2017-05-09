/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_2;

/**
 *
 * @author andro
 */
// This program is not synchronized.
class Callme {

    synchronized void call(String msg) {
        System.out.println(msg);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Booth1 implements Runnable {

    private String msg;
    private Callme target;
    Thread t;

    Booth1(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

class Booth2 implements Runnable {

    private String msg;
    private Callme target;
    Thread t;

    Booth2(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}



class Lab9_2 {

    public static void main(String args[]) {
        Callme target = new Callme();
        Booth1 ob1 = new Booth1(target, "User 1 on call");
        Booth2 ob2 = new Booth2(target, "User 2 on call");
        Booth1 ob3 = new Booth1(target, "User 3 on call");
        Booth2 ob4 = new Booth2(target, "User 4 on call");
        Booth1 ob5 = new Booth1(target, "User 5 on call");
        // wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            ob4.t.join();
            ob5.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
