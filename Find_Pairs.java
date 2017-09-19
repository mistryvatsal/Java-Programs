//A program to find pairs of 2 integers from an array of integers whose sum is equal to "sum" value inputed by the user.

import java.util.Scanner;

public class Find_Pairs{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[100];
		int sum, n, c=0;
		
		System.out.println("ENTER THE SIZE OF THE ARRAY : ");
		n = sc.nextInt();
		
		System.out.println("ENTER THE ELEMENTS IN THE ARRAY : ");
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("ENTER THE VALUE OF THE SUM : ");
		sum = sc.nextInt();

		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(a[i]+a[j] == sum){
					c = c + 1;
					System.out.println("{"+a[i]+", "+a[j]+"}");
				}
			}
		}

		System.out.println("\nTHE TOTAL NUMBER OF PAIRS ARE : "+c);
	}
}