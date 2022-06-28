package com.company;

import java.util.Scanner;

class Test{
    int x;
    int y;
    void input(){
        System.out.println("Enter the value of x and y\n");
        Scanner sc =new Scanner(System.in);
        x =sc.nextInt();
        y=sc.nextInt();
    }
    void output(){
        System.out.println("The valu of x and y is= "+x+" & "+y);
    }

}

public class s_5_Class_Object {
    public static void main(String[] args) {
        Test s =new Test();
        s.input();
        s.output();

    }
}
