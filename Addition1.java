//A program to add 2 numbers using the JAVA interface concept.

import java.util.Scanner;
interface Addition1
{
	int add(int x,int y);
}
class Addition implements Addition1
{
	public int add(int x,int y)
	{
		return (x+y);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Addition a=new Addition();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int l=input.nextInt();
		System.out.print("Enter num2 : ");
		int b=input.nextInt();
		int sum=a.add(l,b);
		System.out.println("Addition : "+sum);
	}
}