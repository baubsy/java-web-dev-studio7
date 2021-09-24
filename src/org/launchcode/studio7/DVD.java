package org.launchcode.studio7;

public class DVD extends BaseDisc{
    private int layers;

    public DVD(int space, String title, String type, int layers) {
        super(space, title, type);
        this.layers = layers;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc(){
        System.out.println("Spinning fast");
    }
}
