package Multithreading;

public class ArithmticThread extends Thread{
    @Override
    public void run(){
        int c=10/0;
        System.out.println(c);

    }
}
