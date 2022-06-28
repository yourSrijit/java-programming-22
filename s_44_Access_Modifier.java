package com.company;
class Cylender{
    private int radius;
    private  int height;
    //Constructor
    public Cylender(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    ///Getter & Setter
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getSurfaceAreas(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double getVolume (){
        return  Math.PI*radius*radius*height;
    }
}


public class s_44_Access_Modifier {
    public static void main(String[] args) {
        Cylender MyCylender = new Cylender(5,10);
//        MyCylender.setHeight(10);
        System.out.println(MyCylender.getHeight());
//        MyCylender.setRadius(5);
        System.out.println(MyCylender.getRadius());
        System.out.println("Total surface of the cylender "+MyCylender.getSurfaceAreas());
        System.out.println("Volume of the cylender is "+MyCylender.getVolume());




    }
}
