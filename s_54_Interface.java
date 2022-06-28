package com.company;
import java.util.Scanner;
interface Superclass{
    void input();
    void output();
}
class subclass implements Superclass {
    String name2;
    int sal;


        public void input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name2 = sc.nextLine();
        System.out.println("Enter your salary");
        sal = sc.nextInt();
                }
        public void output () {
        System.out.println("Your name is " + name2);
        System.out.println("And your salary is " + sal);
    }



}
public class s_54_Interface {
    public static void main(String[] args) {
//        Superclass f =Superclass (); <- Not allowed
        Superclass ob6= new subclass();
        subclass f= new subclass();
        try {
            f.input();
            f.output();

        }catch (Exception c1){
            System.out.println("Exception Handeling Occur");
            System.out.println("Error occur for "+c1.getMessage());
        }

        ob6.input();
        ob6.output();



    }
}
