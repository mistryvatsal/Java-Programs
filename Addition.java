//A program to add 2 numbers using different classes.

import java.util.Scanner;

class Add{
	float x, y, sum;
	Add(float x_c, float y_c){
		x = x_c;
		y = y_c;
	}

	float sum(){
		return x + y;
	}
}

public class Addition{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER : ");
		float a = sc.nextFloat();
		System.out.println("ENTER THE SECOND NUMBER : ");
		float b = sc.nextFloat();

		Add obj = new Add(a,b);
		float s = obj.sum();
		System.out.println("THE SUM IS : " + s);
	}
}