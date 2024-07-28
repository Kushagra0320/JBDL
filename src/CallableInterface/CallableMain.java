package CallableInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableMain {
    public static void main(String[] args) {
        Callable<Integer> callable = new CustomThreadCall();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        //System.out.println(futureTask.isDone());}

    }}