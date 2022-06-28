package com.company;

import java.security.PublicKey;

public class s_7_dresturctorMethod {
    public s_7_dresturctorMethod()
    {
        System.out.println("Constructor Called");
    }
    public void finalize()
    {
        System.out.println("Fianlized Called");
    }
    public static void main(String[] args) {
        s_7_dresturctorMethod ob = new s_7_dresturctorMethod();
        s_7_dresturctorMethod ob1 = new s_7_dresturctorMethod();

        ob=null;
        ob1=null;
        System.gc(); //Garbage Collector

    }
}
