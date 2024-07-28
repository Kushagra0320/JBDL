package Synchronization;

public class MythreadThree {
    Printable printable;
    MythreadThree(Printable printable){
        this.printable=printable;
    }
    public void run(){
        printable.print(3);


    }}
