package lab10;

import java.io.*;
import java.util.*;

/**
 * Created by andro on 18/04/17.
 */
public class lab10_4 {

    public static void main(String[] args) {

        //List example
        List<String> names = new ArrayList<>(); // Collection
        names.add("Nikhil");
        names.add("Ayush");
        names.add("Monish");
        names.add("Alkesh");
        System.out.println(names.size()); // using object name to perform various ops

        //Collections
        Collections.sort(names); // sorted the list using collections class

        //Collection
        Collection<Integer> collection = new ArrayList<>();
        collection.add(10);
        System.out.println(Arrays.toString(collection.toArray()));

        // Queue example
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        System.out.println(queue.peek());

        //Set example
        Set<String> set = new HashSet<>();
        set.add("Lambo");
        set.add("Purari");
        set.add("Puracan");
        set.add("Hoonigan");

    }

    public void file() throws IOException {
        FileWriter fw = new FileWriter("text.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        out.print("hello");
    }
}