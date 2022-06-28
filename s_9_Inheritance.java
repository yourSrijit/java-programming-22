package Inheritance;

import java.util.Scanner;

class A{
    public A(){
        super();
        System.out.println("This is class A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("This is class B");
    }
}
class C extends B{
    int y;
    public C(){
        super();
        System.out.println("This is class C");
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entyer the Y :");
        y=sc.nextInt();
    }
    void display(){
        System.out.println("y="+y);
    }
}


public class s_9_Inheritance {
    public static void main(String[] args) {
        C ob = new C();
        ob.input();
        ob.display();

    }
}
