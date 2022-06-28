package com.company;

import javax.crypto.CipherSpi;

class Circle1{
    int redius;

    Circle1(int r){
        System.out.println("This is Circle class");
           this.redius=r;
    }
    public double  area(){
        return Math.PI* this.redius*this.redius;
    }
}
class Cylinder extends Circle1 {
    int height;

    Cylinder(int r,int h){
        super(r);
        System.out.println("This is Cylinder");
        this.height=h;

    }
}




public class s_52_Practice_Inheritance {
    public static void main(String[] args) {

    }
}
