package Synchronization;

public class MythreadTwo {
    Printable printable;
    MythreadTwo(Printable printable){
        this.printable=printable;
    }
    public void run(){
        printable.print(2);

    }
}
