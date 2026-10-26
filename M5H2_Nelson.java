import java.util.Scanner;
public class M5H2_Nelson
{

    public static void main(String[] args) 
    {
        //Get Input option
        Scanner in = new Scanner(System.in);
        
    
        //(gettimg) Variables
        
        //Constants
        final double price = 4.97;
        final double salary = 2000;

        //Other
        double widgets_sold4, widget_returned4, net_widget, widget_sales_amount, commission, commission_amount, monthly_salary;
        String name;
        
        //input
        System.out.print("What is your Name: ");
        name = in.nextLine();
        int num = 4;
        for (int i = 1; i <= num; i++)
        {
        System.out.print("Enter how many widgets you sold week "+ i +": ");
        widgets_sold4 = in.nextDouble();
        System.out.print("Enter how many widgets were returned week "+ i +": ");
        widget_returned4 = in.nextDouble();
        }

        //Calculation
        net_widget = (widgets_sold1 + widgets_sold2 + widgets_sold3 + widgets_sold4) - (widget_returned1 + widget_returned2 + widget_returned3 + widget_returned4);
        
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
        System.out.println("Net widgets sold: " + net_widget);
        System.out.println("Widget sales amount: $" + widget_sales_amount);
        System.out.println("Commission amount: $" + commission_amount);
        System.out.println("Monthly Salary: $" + monthly_salary);

        //Keep going?
        //String keep_going = "yes";

        //while (keep_going.equalsIgnoreCase("yes")) 
        //{
        //    System.out.println("Do you wish to run program again" + name + "enter yes or no: ");
        //    keep_going = in.nextstring(); 
        //}
        //System.out.println("program has been closed");

        //in.close();
    }
}



