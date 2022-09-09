import java.util.Scanner;

public class week
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter a date:-");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 0:
                    System.exit(0);

            }
        }


    }
}
