package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue= new PriorityQueue<>();
        queue.add("abc");
        queue.add("cde");
        queue.add("fgh");
       // System.out.println(queue); see diff btw both print statements
        while(queue.size()>0){
            String data = queue.remove();
            System.out.println(data);
        }
    }
}
