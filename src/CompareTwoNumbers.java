import java.sql.SQLOutput;
import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstNumber");
        int firstNumberVariable = input.nextInt();

        System.out.println("Enter secondNumber");
        int secondNumberVariable = input.nextInt();


        if (firstNumberVariable > secondNumberVariable){
            System.out.println("First Number is the largest");
        }
        else {
            System.out.println("second number is large");
        }

    }
}
