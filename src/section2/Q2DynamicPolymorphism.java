package section2;

import java.util.Scanner;

interface ArrayOperation{
	default void acceptArray(int a[],int b[]) {
	}
	int[] getResult();
}

public class Q2DynamicPolymorphism {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		
		int choice=k.nextInt();
		
		do {
			System.out.println("===============");
			System.out.println("1. for merge array");
			System.out.println("2. for union operation");
			System.out.println("================");
			System.out.println("Enter choice:- ");
			
			
		}while(true);

		
	}

}
