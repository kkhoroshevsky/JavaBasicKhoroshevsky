import java.util.*;

public class Lecture1_1 {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = "";

        if (number>500) {
            while (number > 0) {
                result = result.concat(String.valueOf(number % 10));
                number /= 10;
            }
            System.out.println("Your result is: " + result);
        } else if (number>99 & number<500){

            String numberFirst = String.valueOf(number/100);
            String numberSecond = String.valueOf((number/10)%10);
            String numberThird = String.valueOf(number%10);
            result = numberFirst + numberThird + numberSecond;

            System.out.println("Your result is: " + result);
        } else {
            System.out.println("Incorrect number");
        }
        input.close();
    }
}
