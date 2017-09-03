import java.util.Scanner;

public class Non_Prime1{
	static int r, number, temp = 0;
	int checkeven(int n){
		if(n%2==0){
			return 1;
		}
		else
		{
			return 0;
		}
	}

	void non_odd(int number){
		temp = number/10;
		while(temp>0){
			non_odd(temp);
		}
		int n;
		r = number % 10;
		n = checkeven(r);
		if(n == 1){
			System.out.println(r);	
		}
		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Non_Prime1 obj = new Non_Prime1();
		System.out.println("Enter any number : ");
		number = sc.nextInt();
		temp = number;
	
		if(number > 9){
			obj.non_odd(temp);
		}
		
		else if(number == 0){
			System.out.println("You moron !");
		}

		else{
			if(obj.checkeven(number) == 1){
				System.out.println(number);
			}
			else{
				System.out.println("There is no even number !");
			}
		}
	}

}
