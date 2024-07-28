package Synchronization;

public class SyncMain {
    public static void main(String[] args) {
        Printable printable = new Printable();
        MythreadTwo mythreadTwo = new MythreadTwo(printable);
        MythreadThree mythreadThree= new MythreadThree(printable);

    }
}

