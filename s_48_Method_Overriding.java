package com.company;
class  A {
    void method() {
        System.out.println("We are in the Class A");
    }
}

class B extends A{
    void method(){
        System.out.println("We are in the Class B ");
    }
}
public class s_48_Method_Overriding {
    public static void main(String[] args) {
        A a =new A();
        B b =new B();
        a.method();
        b.method();


    }
}
