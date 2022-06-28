package Overloading;
class A1{
    static int Test(int a,int b){
        System.out.println("Test 1 is called");
        return a+b;
    }
   static int Test(int a,int b,int c) {
       System.out.println("Test 2 is called");
       return a + b + c;
   }
    static double Test(double a,double b){
        System.out.println("Test 3 is called");
        return a+b;
    }
    static double Test(double a,int b){
        System.out.println("Test 4 is called");
        return a+b;
    }

}
public class s_8_Method_Overloading {
    public static void main(String[] args) {
        A1 ob =new A1();
        System.out.println(A1.Test(4,5));
        System.out.println(A1.Test(5,6,7));
        System.out.println(A1.Test(5.6,7.9));
        System.out.println(A1.Test(3.2,5));
    }
}
