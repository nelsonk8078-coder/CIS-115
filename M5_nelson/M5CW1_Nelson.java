import java.util.Scanner;
public class M5CW1_Nelson 
{
     Scanner k = new Scanner(System.in);
     double number5, total;

     System.out.print("How many numbers are you adding: ");
     int num = k.nextInt();
     for (int i = 1; i<= num; i++)
     {
        System.out.print("Enter number "+ i +"");
        number5 = k.nextDouble();
     }
     
}
