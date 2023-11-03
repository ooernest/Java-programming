import java.sql.SQLOutput;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age");
        int number = input.nextInt();

        if (number > 18) {
            System.out.println("You are older than 18");

        } else {
            System.out.println("You are lesser than 18");
        }
        }
    }
