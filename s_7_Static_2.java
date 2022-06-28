//Write a JAVA programm to to find the number of Objects used in the

package com.company;

public class s_7_Static_2 {
    public int x =5;
    public static int y =0;
    public s_7_Static_2(){
        x++;
        y++;
    }
    public void Display(){
        System.out.println(x+" : "+y);  //**** we can see that the value of y denotes the number of objects ****

    }
    public static void main(String[] args) {
        s_7_Static_2 ob =new s_7_Static_2();
        s_7_Static_2 ob1 =new s_7_Static_2();
        ob.Display();
        ob1.Display();

    }
}
