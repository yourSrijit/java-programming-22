package com.company;

import org.w3c.dom.ls.LSOutput;

interface TV{
    void onORoff();
    void next();
   default void previous(){       // Default Method
       System.out.println("Go to the previous channel");
   }
}

interface spisker{
    void Beep();
}

class Display{
    void display(){
        System.out.println("Turning on the display");
    }
}
class SmartTV extends Display implements TV,spisker{

    @Override
    public void onORoff() {
        System.out.println("Turn on or off the TV");

    }
    @Override
    public void next() {
        System.out.println("Go to next channel");
    }

    @Override
    public void Beep() {
        System.out.println("Beppppppppppppp");
    }
    public void previous(){
        System.out.println("please go go th e previous channel");
    }
}

public class s_57_Default_Method {
    public static void main(String[] args) {
        SmartTV remort = new SmartTV();
        remort.Beep();
        remort.next();
        remort.onORoff();
        remort.previous();
        remort.display();
    }
}
