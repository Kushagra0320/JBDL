package SingletonPattern;

public class Student {
    private Student(){}  // Constructor which restricts new keyword because java wont create default constructor.

    private static Student INSTANCE = null; // created to avoid new object creation


    public static Student getInstance(){ // method that returns object for student class
        if(INSTANCE==null){
            INSTANCE= new Student();
        }
        //return new Student(); // but this will create a new object everytime which we dont want
    return INSTANCE;
    }
}
