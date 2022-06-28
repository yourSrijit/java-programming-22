package com.company;

import javax.naming.PartialResultException;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am a Constructor of class Parent2");
    }

    public void Method69(){
        System.out.println("I a m 69");
    }
    abstract public void greet();

}

class child2 extends Parent2{
    public void greet(){
        System.out.println("God Morning Srijit");
    }
}

abstract class child3 extends Parent2{
    public void Method60(){
        System.out.println("I am 60");
    }
}

public class s_53_Abstract_Class {
    public static void main(String[] args) {
//        Parent2 p =new Parent2() ; // Creating object of Abstract Class is not Allowed
        child2 c = new child2();
//        child3 c1 =new child3() ;  //Not allowed
        Parent2 p1 =new child2() ;//Upcasting





    }
}
