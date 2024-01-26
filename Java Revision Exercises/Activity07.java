import java.util.Scanner;

public class Activity07
{
   public static void main(String args[])
    {

   Scanner scanner = new Scanner(System.in);

   System.out.print("Input one number:");
   int num = scanner.nextInt();

   System.out.println("Expect output" + num + ":");

   for(int i=1 ; i <= 10 ; i++)
     {

     int a = num * i ;
     System.out.println(num + "x" + i + "=" + a);
     }

    }
}