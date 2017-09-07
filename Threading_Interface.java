//A program to demonstrate Thread using Runnable Interface.

public class Threading_Interface implements Runnable{
   
   private String message;

   public void run(){
   	System.out.println("This is a new thread...");
   }

   public static void main(String args[]){
   	Threading_Interface obj = new Threading_Interface();
   	Thread t = new Thread(obj);
   	t.start();
   }
}
