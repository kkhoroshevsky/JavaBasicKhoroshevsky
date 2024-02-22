import java.sql.Array;
import java.util.*;

public class Lecture1_2 {
    public static void main(String[] args) {

        //считаем все трехзначные числа
        for (int i = 100; i < 1000; i++) {
            //считаем остаток числа = 0
            if (i % 10 == 0) {
                //находим делители
                List<Integer> divisors = new ArrayList<>();
                for (int y = 2; y <= i / 2; y++) {
                    if (i % y == 0) {
                        divisors.add(i);
                        //System.out.println("divisors: " + divisors);
                    }
                }
                //находим нечетные делители
                List<Integer> arrayOfOddDivisors = new ArrayList<>();
                int summOfDivisors = 0;
                for (int z = 0; z < divisors.size(); z++) {

                    if (divisors.get(z) % 2 != 0) {
                        summOfDivisors += divisors.get(z);
                        arrayOfOddDivisors.add(divisors.get(z));
                    }
                }
                //сумма элементов массива
                if (summOfDivisors % 10 == 0) {
                    System.out.println("result is: " + i);
                }
            }
        }
    }
}
