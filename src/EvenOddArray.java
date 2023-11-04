//write a java program that count even and odd number in array

public class EvenOddArray {
    public static void main(String[] args) {

        //    Write a java program that counts the number of the Even and Odd numbers in array.
//    by default the even and odd numbers will be 0
//    that's why we have "countEvenNumber" and "countOddNumber" = 0

        int countEvenNumber = 0;
        int countOddNumber = 0;

//        then I create an array of integers
    int[] listOfNumbers = {2, 5, 6, 22, 8, 32, 5, 1, 84};

//   then i create a variable named "number" that saves all the information in the array

    for (int number : listOfNumbers){
// then i told the "number" variable to divide all the integers by 2 and make sure the reinder is equals to 0,
//        for us to get the even number
        if ( number % 2 == 0){
//            then we said, if the reminder is equals 0, then count it as an even number
            countEvenNumber++;
        }
//        else count it as an odd number
        else {
            countOddNumber++;
        }
    }
        System.out.println("we have" + countEvenNumber + "even numbers");
        System.out.println("we have" + countOddNumber + "odd numbers");
    }
}
