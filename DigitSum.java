// A program to add the digits in a number.

import java.io.*;

class DigitSum
{
   public static void main(String args[])
   {
       int i,a=0, sum=0;
       i=Integer.parseInt(args[0]);           
       while(i!=0)
       {
           a=i%10;
           i=i/10;
           sum=sum+a;
       }
       System.out.println(sum);
   }
}

