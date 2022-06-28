package com.company;


class Base{
    int x;

    public int getX() {

        return x;
    }

    public void setX(int x) {
        System.out.println("This is Base and setting the X");
        this.x = x;
    }
}
class Derived extends Base {
    int y;

    public int getY() {
        System.out.println("This is Derived Class");

        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class s_45_Interitance_in_JAVA {
    public static void main(String[] args) {
        Base b =new Base();
        b.setX(5);
        System.out.println(b.getX());

        Derived d =new Derived();
        d.setX(55);
        System.out.println(d.getX());

        d.setY(20);
        System.out.println(d.getY());



    }
}
