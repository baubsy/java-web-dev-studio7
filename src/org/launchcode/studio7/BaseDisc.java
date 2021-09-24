package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{
    private int space;
    private String title;
    private String type;

    public BaseDisc(int space, String title, String type){
        this.space = space;
        this.title = title;
        this.type = type;
    }
    public void spinDisc(){
        System.out.println("Spinning the disc");
    }
    public void stopSpin(){
        System.out.println("Stopping the spinning");
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
