package Multithreading;

public class MainMultithreading {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        Mythread mythread2= new Mythread();
        //System.out.println(mythread.getName()); //for getting thread name
        mythread.start();
        mythread2.start();
    }
}
