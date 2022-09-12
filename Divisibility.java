package polu;

import java.util.Scanner;

public class Divisibility
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ");
        int input= sc.nextInt();
        if ( input %10==0)
        {System.out.println("Yes");}
        else{System.out.println("No");}
    }
}
