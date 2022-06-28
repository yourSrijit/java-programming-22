import java.util.Scanner;

public class s_1_Pass_Fail {

	public static void main(String[] args) {
	
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number");
		n=sc.nextInt();
		if(n<=25) {
			System.out.println("You are fail");
		}
		else if(n<=50 && n>=25 && n<75) {
			System.out.println("Try your best");
		}
		
		else {
			System.out.println("You are topper");
		}

	}

}
