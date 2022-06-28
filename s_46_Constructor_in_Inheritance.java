package com.company;

/* Parent Class */
class ParentClass
{
    /* Constructor */
    ParentClass() {

        System.out.println("ParentClass constructor executed.");
    }
    ParentClass(int a)
    {

        System.out.println("Overloaded Parentclass with value of a="+a);
    }

}

/* Child Class */
class ChildClass extends ParentClass
{

    /* Constructor */
    ChildClass()
    {
        super(0);
        System.out.println("ChildClass constructor executed.");
    }
}

public class s_46_Constructor_in_Inheritance
{
    /* Driver Code */

    public static void main(String ar[])
    {
        /* Create instance of ChildClass */
        System.out.println("Order of constructor execution...");
        new ChildClass();
    }
}