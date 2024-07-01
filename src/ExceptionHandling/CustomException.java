package ExceptionHandling;

public class CustomException {
    public static void main(String[] args) throws PersonNotEligible {
        doVoting(13);

    }
    public static void doVoting(int age) throws PersonNotEligible {
        if(age<18){
            throw new PersonNotEligible("Age is less than 18");
        }
        System.out.println("Voting done");
    }
}
class PersonNotEligible extends Exception{
    PersonNotEligible(String msg){
        super(msg);
    }

}
