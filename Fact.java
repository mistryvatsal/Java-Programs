//A program to find factorial of number.

import java.util.Scanner;

public class Fact{
	
	static int factorial(int n){
		int f = 1;
		if(n==1){
			f = 1;
		}
		else{
			f = n * factorial(n-1);
		}
		return f;
	}


	public static void main(String args[]){
		int fact;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int n = sc.nextInt();
		fact = factorial(n);
		System.out.println("THE FACTORIAL OF THE ENTERED NUBMER IS : " + fact);

	}
}