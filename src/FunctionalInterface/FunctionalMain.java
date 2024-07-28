package FunctionalInterface;

public class FunctionalMain {
    public static void main(String[] args) {

    }
}

interface task{// this is a functional interface
    abstract void m1();
}
interface noTask{// not a funtional interface beacause has two abstract methods
    abstract void m2();
    abstract void m3();
}
// use of annotation functional interface which allows only one abstract method
@FunctionalInterface
interface taskeg{// if we try to do more than one abstract method the annotation will show error
    abstract void m3();// we can either write abstract or not
    default void m4(){

    }
    @FunctionalInterface
    interface child extends taskeg{
        abstract void m3();
    }

}

