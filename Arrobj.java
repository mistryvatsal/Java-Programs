//A program to demonstrate the use of Array of Objects.

import java.util.Scanner;

class Student{
	String name;
	int enroll_no, age;

	Student(String name_c, int enroll_no_c, int age_c){
		name = name_c;
		enroll_no = enroll_no_c;
		age = age_c;
	}

	void display(){
		System.out.println("Name is : " + name);
		System.out.println("Enrollment Number is : " + enroll_no);
		System.out.println("Age is " + age);
	}
}

public class Arrobj{
	public static void main(String args[]){
		Student[] obj = new Student[2];
		int i = 0;
		while(i<2){
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER THE NAME OF THE STUDENT : ");
			String name_m = sc.next();
			System.out.println("ENTER THE ENROLLMENT NUMBER : ");
			int enroll_no_m = sc.nextInt();
			System.out.println("ENTER THE AGE : ");
			int age_m = sc.nextInt();
			obj[i] = new Student(name_m, enroll_no_m, age_m);

			// obj[i].display();

			i+=1;
		}
		
		System.out.println("THE DATA YOU ENTERED IS : \n\n");
		
		i = 0;

		while(i<2){
			obj[i].display();
			i+=1;
		}
	}
}