package OOPS;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Person person=new Person();
    person.setName("Robin");
    person.setEmail("robin@GMAIL.COM");
    person.setAge(19);
        Person person2=new Person();
        person2.setName("Robin");
        person2.setEmail("robin@GMAIL.COM");
        person2.setAge(19);
        //System.out.println(person);
        Set<Person> set = new HashSet<>();
        set.add(person);
        set.add(person2);
        System.out.println(set.size());
}}
