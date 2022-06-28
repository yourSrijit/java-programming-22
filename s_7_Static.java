package com.company;

import java.util.Scanner;

public class s_7_Static {
    public int x,y;
    public static int z;
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of x y & z");
        x=sc.nextInt();
        y=sc.nextInt(); //as x & y is not static so they are variables of  objects
        z=sc.nextInt();
        z =8;  // as z is statiC,it is the variable of the class
                       }
    public void dispaly(){
        System.out.println(x+" : "+y+" : "+z);
    }

    public static void main(String[] args) {
       s_7_Static ob = new s_7_Static();
       s_7_Static ob1 = new s_7_Static();
       ob.input();
       ob1.input();
       ob.dispaly();
       ob1.dispaly();

    }


}
