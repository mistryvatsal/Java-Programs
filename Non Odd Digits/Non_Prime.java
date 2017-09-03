import java.util.Scanner;

public class Non_Prime{
	int checkeven(int n){
		if(n%2==0){
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Non_Prime obj = new Non_Prime();
		int number, r;
		System.out.println("ENTER THE NUMBER : ");
		int n = sc.nextInt();
		System.out.println("\n");
		System.out.println("THE NON-ODD DIGITS IN THE NUMBER YOU ENTERED ARE AS BELOW : ");
		if(n>9){
		while(n>0){
					r = n % 10;
					n = n / 10;
					number = obj.checkeven(r);
					if(number == 1){
						System.out.println(r);	
					}
				}
			}
		else{
			number = obj.checkeven(n);
			if(number == 1){
						System.out.println(n);	
					}
			else{
				System.out.println("There is no NON-ODD Digit you fool !");
			}
		}
	}
}
