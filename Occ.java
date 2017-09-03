// A program to count the number of occurence of digits of given number.

import java.util.Scanner;

class Occurance{
	int n,i,j,rem;

int check(int num,int che){
			int occ=0,quo=num;
			while(quo>0){
				rem=quo%10;
				quo=quo/10;
				if(che==rem)
					{
						occ++;
					}
				}
			return occ;
	}
}

public class Occ{
	public static void main(String args[]){
		Occurance oc = new Occurance();
		Scanner sc =  new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int number = sc.nextInt();
		System.out.println("ENTER THE DIGIT WHOSE OCCURANCE YOU WANT : ");
		int occur = sc.nextInt();
		int result = oc.check(number, occur);
		System.out.println("The required digit "+occur+" has occured "+result+" times.");
	}
}
