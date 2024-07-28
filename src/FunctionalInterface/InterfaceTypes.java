package FunctionalInterface;

import java.util.function.Predicate;

public class InterfaceTypes {
    public static void main(String[] args) {
        Predicate<Integer> predicate2=new Predicate<Integer>() {// this is a anonymous class
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
    }
}
class PredicateImpl implements Predicate<Integer> {

    public boolean test(Integer integer) {
        if (integer % 2 == 0) {
            return true;
        }
        return false;
    }
}
class FunctionalImpl {


}


