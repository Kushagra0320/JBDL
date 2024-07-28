package OOPS;

public class Person {
    String name;
    String email;
    int age;
    Person(String name , String email,int age){
    this.name=name;// this keyword used for variable pointing
    this.email=email;
    this.age=age;}
    Person(int age){
        this.age=age;
    }
    Person(){
        this(23);//this keyword used for constructor calling
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {// when we convert object into nuymeric form it is hashcode.
        return this.name.hashCode()+this.email.hashCode();
    }

    @Override
    public boolean equals(Object o) {// if we dont do this size will be 2
        Person p= (Person) o ;
        if(this.email.equals(p.email) && this.name.equals(p.name)){
            return true;}
        else{
            return false;
        }
        }
    }


