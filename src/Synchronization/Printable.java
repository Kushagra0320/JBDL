package Synchronization;

public class Printable {
    public synchronized void print(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+"*"+i+"=" + " "+ n*i);

        }
    }
}
