package ExceptionHandling;

public class ExceptiopnHandled {
    public static void main(String[] args) {
       /* int [] arr=new int[2];

        try{
            System.out.println(arr[7]);

        }
        catch (Exception ex){
        // Exception is the parent class of handling exceptions in java
            // there are varios classes for various exceptions in java but Exception is the parent class.
            System.out.println("Exception occured");
        }*/
// we cant run two exceptions together without creating multiple try-catch block aas below.
        // Run below to understand above statement

       /* int a = 10;
        int b = 0;
        String s = null;
        System.out.println(s.length()) ;// If we run this without creating its catch block it will show exception error
        try {
            int c = a / b;
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
        System.out.println("Exception Handled");
    }
}*/
        String s = null;
        //System.out.println(s.length()) ; If we run this without creating its catch block it will show exception error
        try {

            System.out.println(s.length()) ;


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
                System.out.println("Exception Handled");
    }
            }

