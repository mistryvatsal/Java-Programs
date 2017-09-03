//A program to demonstrate function overloading.

import java.util.Scanner;

public class Volume_Overloading{
	int volume(int r){
		return 4/3*3*r*r*r;
	}

	int volume(int l, int b, int h){
		return l*b*h;
	}

	public static void main(String args[]){
		int vol=0;
		Volume_Overloading obj = new Volume_Overloading();
		Scanner sc = new Scanner(System.in);
		System.out.println("1: VOLUME OF SPHERE \n2: VOLUME OF BOX \n\nENTER YOUR CHOICE: ");
		int ch = sc.nextInt();
		if(ch==1){
			System.out.println("ENTER THE RADIUS OF THE SPHERE : ");
			int radius = sc.nextInt();
			vol = obj.volume(radius);
			System.out.println("THE VOLUME OF THE SPHERE IS : " + vol);
		}		
		else{
			System.out.println("ENTER THE LENGTH OF THE SPHERE : ");
			int length = sc.nextInt();
			System.out.println("ENTER THE BREADTH OF THE SPHERE : ");
			int breadth = sc.nextInt();
			System.out.println("ENTER THE HEIGHT OF THE SPHERE : ");
			int height = sc.nextInt();
			vol = obj.volume(length, breadth, height);
			System.out.println("THE VOLUME OF THE SPHERE IS : " + vol);
		}
	}
}