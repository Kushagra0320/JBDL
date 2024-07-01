package ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class CheckedException {
    public static void main(String[] args) {
        //int a=10/0;
        //System.out.println(a);
        File f= new File("");
        //FileInputStream file= new FileInputStream(f); java knows that this file might or might not exist
        try{
            FileInputStream file= new FileInputStream(f);

        }
        catch(FileNotFoundException ex){
            System.out.println("DETECTED EXCEPTION");

        }
    }
}
