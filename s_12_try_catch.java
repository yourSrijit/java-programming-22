package Exception_Handeling;
import java.util.Scanner;
public class s_12_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        String n =null;
        int s[]= new int[4];
        try {
            System.out.println("Enter x");
            x = sc.nextInt();
            System.out.println("Enter y");
            y = sc.nextInt();
            z = x / y;
            System.out.println("So z= " + z);


            s[3]=20;


            System.out.println(n.length());
        }

//        catch (ArithmeticException c){
//            System.out.println("Exceptipon Handeloing occur for ArithmeticException");
//        }
//        catch (NullPointerException c){
//            System.out.println("Exception Handeling occur for NullPointerException");
//        }


        catch (Exception c) {
    System.out.println("Exception handeling occur for "+c.getMessage());
//            c .printStackTrace();
            }


            System.out.println("End");
    }
}
