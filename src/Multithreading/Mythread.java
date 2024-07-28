package Multithreading;

public class Mythread extends Thread {
    @Override
    public void run(){
       // System.out.println("Inside Thread" + " " + Thread.currentThread().getName());
       /* for (int i = 0; i <=20 ; i++) {
            System.out.println(i+ "  " +" "+ Thread.currentThread().getName());*/
            // for getting thread name-> Thread.currentThread().getName()
        ArithmticThread arithmticThread= new ArithmticThread();
        arithmticThread.start();


        }
    }


