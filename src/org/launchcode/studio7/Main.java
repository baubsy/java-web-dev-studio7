package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        String[] test = new String[7];
        test[2] = "test";
        System.out.println(test[2]);
        CD testCD = new CD(500,"Home work", "data");
        DVD testDVD = new DVD(4800, "homework", "data", 1);
        testCD.spinDisc();
        testDVD.spinDisc();

        testCD.addSong("test");
        testCD.printSongs();

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
