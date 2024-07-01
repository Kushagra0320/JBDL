package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        int[] arr = new int[2];

        try {
            System.out.println(arr[7]);
        } catch (Exception ex) {
            // Exception is the parent class of handling exceptions in Java.
            // There are various classes for various exceptions in Java, but Exception is the parent class.
            System.out.println("Exception occurred");
        } finally {
            // This block will always execute, whether an exception is thrown or not.
            System.out.println("Finally block executed");
        }
        System.out.println("Exception Handled");
    }
}
// we can do the same using try with resource which is a simplified process
