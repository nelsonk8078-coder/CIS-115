import java.util.Scanner;
public class M4H1_Nelson
{

    public static void main(String[] args) 
    {
        //Get Input option
        Scanner keyboard = new Scanner(System.in);
        //(gettimg) Variables
        
        //Constants
        final double price = 4.97;
        final double salary = 2000;

        //Other
        double widgets_sold, widget_returned, net_widget, widget_sales_amount, commission, commission_amount, monthly_salary;
        String name;
        
        //input
        System.out.print("What is your Name");
        name = keyboard.nextLine();
        System.out.print("Enter how many widgets you sold: ");
        widgets_sold = keyboard.nextDouble();
        System.out.print("Enter how many widgets were returned: ");
        widget_returned = keyboard.nextDouble();

        //Calculation
        net_widget = widgets_sold - widget_returned;
        
        if (net_widget <= 100)
            commission = 0.1;
        else if (net_widget <= 199)
            commission = 0.15;
        else if (net_widget <= 299)
            commission = 0.2;
        else
            commission = 0.25;

        widget_sales_amount = net_widget * price;
        commission_amount = commission * widget_sales_amount;
        monthly_salary = commission_amount + salary;

        //Display
        System.out.println(name);
        System.out.println("$" net_widget);

    }
}