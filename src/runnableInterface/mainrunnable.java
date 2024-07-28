package runnableInterface;

public class mainrunnable {
    public static void main(String[] args) {
       Runnable customThread= new CustomThread();
        //customThread.run();
        Thread thread = new Thread(String.valueOf(customThread));
        thread.start();
    }
}
