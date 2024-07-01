package AbstractClass;

public class Abstract {
    public static void main(String[] args) {
        // this is how we can implement abstract class in our program.
       // Bank c=new Bank(); we cant create object of the abstract class but can create refrence as below.
        Bank a= new HDFC();// here we used abstract class as a refrence.
        Bank b= new ICICI();
        a.depositAmount();
        a.calculateinterest();
        b.calculateinterest();
        b.depositAmount();
    }
}
