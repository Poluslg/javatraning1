package polu;
import java.util.*;


public class Ifelse
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:-");
        int input1=sc.nextInt();
        System.out.println("Enter Another Number");
        int input2= sc.nextInt();

        if (input1>input2)
        {
            System.out.print("The Value is Greater than second Number");
        }
        else if (input1<input2)
        {
           System.out.println ("The Value is Greater than second Number");
        }
        else
         {
                System.out.print("The both values are same");
         }
    }
}
