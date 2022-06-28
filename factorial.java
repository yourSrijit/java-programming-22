package Self_Practice_2022;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factoaril");
        int n=sc.nextInt();
        int f=1,i=1;
        while(i<=n){
            f=f*i;
            i++;
        }
        System.out.println("So the factorial of "+n+" is "+f);

    }
}
