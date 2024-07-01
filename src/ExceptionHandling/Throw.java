package ExceptionHandling;
import java.util.*;

public class Throw {
    public static void main(String[] args) {
        //  System.out.println(divide(2,2));
        /*try {
            System.out.println(divide(2, 0));
        } catch (ArithmeticException ex) {
            System.out.println("Exception handled");
        }*/
        System.out.println(divide(2,0));
    }



        public static int divide ( int a, int b){
            if (a == 0 || b == 0) {
                throw new ArithmeticException("Numbers Cant be zero");
                // we can put any number in place of zero and can throw an exception, we use throw keyword to create exceptions by ux or user.

            }

        return a / b;
    }}

