package com.company;

import java.security.PublicKey;

class Phone{
    public void ShowTime(){
        System.out.println("Your Time is 8 PM");
    }
    public void on(){
        System.out.println("Starting on your Phone ");
    }
}

class SmartPhone extends Phone
{
    public void greet(){
        System.out.println("Have a good day Srijit");
    }
    public void on(){
        System.out.println("Starting on your SmartPhone");
    }
}
public class s_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone ob =new SmartPhone();         //<- This is Allowed
//      SmartPhone ob1=new Phone();           <--- This is not Allowed
        ob.on();
        ob.ShowTime();
//        ob.greet();   <-- This is not Allowed


    }
}
