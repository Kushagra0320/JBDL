package Conditional_Synchronization;

public class SharedData {
    int data;
    public void produce(int data){
        this.data=data;

    }
    public void consume(){
        System.out.println("Consumed Data:" + this.data);

    }
}
