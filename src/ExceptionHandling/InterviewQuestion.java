package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;

public class InterviewQuestion {
    public static void main(String[] args) {
        //int a = 10;
        //int b = 0;
        File f= new File("");

        try {
           // int c = a / b;
            FileInputStream file= new FileInputStream(f);
        }
        catch(ArithmeticException ex){
            System.out.println("Exception occured");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception in array accesing");
        }
        catch (NullPointerException ex){
            System.out.println("String length exception handled");
        }
        catch(Exception ex){
            System.out.println("Unknown Exceotion handled");// this will handle unknow exception
            // but we cant create in starting because after that all possible exceptions handled will be of no use.
        }
        System.out.println("Exception Handled");
    }
    }

