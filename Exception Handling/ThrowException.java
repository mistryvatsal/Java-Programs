import java.util.Scanner;

public class ThrowException{
	int output;
	void divisonbyzero(int a, int b){
		try{
			output = a/b;
			System.out.println("THE OUTPUT OF THE DIVISION IS : " + output);
		}
		catch(ArithmeticException e){
			//System.out.println(e);
			System.out.println("ARE YOU OUT OF YOUR MIND??? YOU CANNOT HAVE ZERO AS DIVISOR . . .");
		}
		
	}

	public static void main(String args[]){
		ThrowException obj = new ThrowException();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE DIVIDEND : ");
		int x = sc.nextInt();
		System.out.println("ENTER THE DIVISOR : ");
		int y = sc.nextInt();
		obj.divisonbyzero(x, y);
	}
}