import java.util.Scanner;

public class Activity06
{
   public static void main(String args[])
     {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Input first number");
       int num1 = scanner.nextInt();

       System.out.print("Input second number");
       int num2 = scanner.nextInt();

       int a = num1 + num2;
       int b = num1 - num2;
       int c = num1 * num2;
       int d = num1 / num2;
       int e = num1 % num2;

       System.out.println(num1 + "+" + num2 + "=" + a);
       System.out.println(num1 + "-" + num2 + "=" + b);
       System.out.println(num1 + "x" + num2 + "=" + c);
       System.out.println(num1 + "/" + num2 + "=" + d);
       System.out.println(num1 + "mod" + num2 + "=" + e);

     }
}