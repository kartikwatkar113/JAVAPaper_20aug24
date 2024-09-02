package section1;

import java.util.Scanner;

public class Q2SecondHigh {
	
	public static void main(String x[]) {
		
//		Scanner k=new Scanner(System.in);
//		System.out.println("Enter Array Element:- ");
//		int arr[]=new int[5];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=k.nextInt();
//		}
		
		int arr[]= {8,9,7,3,2,3,5,7,3,5,0};
		
		int max=arr[0];
		int secmax=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max:- "+max);
		for(int i=0; i<arr.length; i++) {
			if(max!=arr[i]&&secmax<arr[i]) {
				
				secmax=arr[i];
			}
		}
		System.out.println("Second max:- "+secmax);
	}

}
