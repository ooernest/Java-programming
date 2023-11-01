import java.sql.SQLOutput;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade: ");
        int gradeResult = input.nextInt();

        if(gradeResult >= 50 && gradeResult <= 59) {
            System.out.println("Grade is C");
        }
        if (gradeResult >=60 && gradeResult <= 69){
            System.out.println("Grade is B");
        }
        if (gradeResult >= 70 && gradeResult <= 100) {
            System.out.println("Grade is A");
        }


    }

}
