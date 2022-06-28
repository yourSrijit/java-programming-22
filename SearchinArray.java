import java.util.Scanner;

public class SearchinArray {
public static void main(String[] args) {
	int a[]=new int [10];
	int key;
	int f=0,i=0;
	
	try (Scanner sc = new Scanner (System.in)) {
		System.out.println("Enter the elements of the Array");
		for(int i1=0; i1<10; i1++) {
			
			System.out.println("x"+i1+"=");
			a[i1]=sc.nextInt();
		}
		System.out.println("Elements of the arrays are");
		for(int i1=0; i1<10; i1++) {
			
			System.out.println(a[i1]);
		}
		System.out.println("Enter the searching element");
		key=sc.nextInt() ;
	}
	for(int i1=0;i1<10;i1++) {
		if(a[i1]==key) {
			f=1;
			i=i1;
			break;
		}
	}
	if(f==1) 
		{
			System.out.println(key+" is the "+(i+1)+" no elemeent");
		}
		else {
			System.out.println("Element is not in array");
		}	
}
}
