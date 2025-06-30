import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

   
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    // Increase count if divisible
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + countMap.get(i));
        }
    }
}
