package CallableInterface;

import java.util.concurrent.Callable;

public class CustomThreadCall implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i <=5 ; i++) {
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException ex){

            }
            System.out.println(i);

        }
        return 1;
    }}



