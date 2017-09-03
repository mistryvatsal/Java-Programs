//To demonstrate method overriding.

import java.util.Scanner;

class Sphere{
	int volume(int r){
		return 4/3*3*r*r*r;
	}
}

class Box extends Sphere{
	int volume(int l, int b, int h){
		return l * b * h;
	}
}

public class Method_Overriding{
	public static void main(String args[]){
		int vol;
		Box bx = new Box();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF THE BOX : ");
		int l = sc.nextInt();
		System.out.println("ENTER THE BREADTH OF THE BOX : ");
		int b = sc.nextInt();
		System.out.println("ENTER THE HEIGHT OF THE BOX : ");
		int h = sc.nextInt();
		vol = bx.volume(l,b,h);
		System.out.println("THE VOLUME OF THE BOX IS : " + vol);
	}
}