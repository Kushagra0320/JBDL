package Generics;
import java.util.*;

public class Test {
    static void printStudents(ArrayList<? extends Student> al){
        for(Student s:al){
            s.print();
        }
    }

    public static void main(String[] args) {
        ArrayList<EnggStudent> al1= new ArrayList<>();
        al1.add(new EnggStudent());
        al1.add(new EnggStudent());
        ArrayList<MgmtStudent> al2= new ArrayList<>();
        al2.add(new MgmtStudent());
        printStudents(al1);
        printStudents(al2);
    }


    }

