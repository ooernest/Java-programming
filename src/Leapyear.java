import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter year");
        int yearVariable = scanner.nextInt();

        if (yearVariable % 4 == 0){
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }
    }
}