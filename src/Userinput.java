import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-");
        int a1 = sc.nextInt();
        System.out.println("Enter Second Number:-");
        int b1 = sc.nextInt();
        int Sum = a1 + b1;
        int Sub = a1 - b1;
        int Div = a1 / b1;
        int Multi = a1 * b1;
        if (a1 > b1) {
            System.out.println("");
        } else {
            System.out.println("");
        }

        System.out.println("Sum of two Numbers are:- " + Sum);
        System.out.println("Sub of two Numbers are:-" + Sub);
        System.out.println("Div of two Numbers are:-" + Div);
        System.out.println("Multi of two Numbers are::-" + Multi);

    }
}