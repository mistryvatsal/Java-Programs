import java.util.Scanner;

public class ThrowArrayOutofBoundException{
	int a[] = new a[5];
	Scanner sc = new.Scanner();
	void inputdata(){
			System.out.println("ENTER THE ELEMENTS IN THE ARRAY : ");
			for(i=0;i<5;i++){
				a[i] = sc.nextInt();
			}
		}

		void outputdata(){
			try{
				for(i=0;i<6;i++){
					System.out.println(a[i]);
					}
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Fool... The array is out of bound.");
			}

	}
	public static void main(String args[]){
		ThrowArrayOutofBoundException 
		
	}
}