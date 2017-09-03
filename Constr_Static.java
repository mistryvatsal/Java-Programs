//A program to demonstrate constructor and static keyword in java.
import java.util.Scanner;

class Nikul{
	String name;
	int age;
	static String department = "Computer Science & Engineering";
	
	Nikul(String name_c, int age_c){
		name = name_c;
		age = age_c;
	}
	void display(){
		System.out.println("The name is : " + name);
		System.out.println("The age is : " + age);
		System.out.println("The department is : " + department);
	}
}

public class Constr_Static{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String name = sc.next();
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();

		Nikul obj = new Nikul(name, age);
		System.out.println("\n\nThe details you entered is : \n\n");
		obj.display();
	}
}