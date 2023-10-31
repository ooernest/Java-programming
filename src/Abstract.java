import java.util.Scanner;

public class Abstract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();

        System.out.println("Enter secound Number");
        int secondNumber = input.nextInt();

        int sum = firstNumber * secondNumber;
        System.out.println("the sum of the two numbers" + sum);



    }
}
