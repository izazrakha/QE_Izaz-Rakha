import java.util.ArrayList;
import java.util.List;

public class UniqueDigits {
    public static void main(String[] args) {
        String input1 = "76523752";
        String input2 = "1122";
        List<Integer> uniqueDigits1 = findUniqueDigits(input1);
        List<Integer> uniqueDigits2 = findUniqueDigits(input2);
        System.out.println(uniqueDigits1);
        System.out.println(uniqueDigits2);
    }
    public static List<Integer> findUniqueDigits(String input) {
        List<Integer> uniqueDigits = new ArrayList<>();
        int[] digitCount = new int[10];
        for (char digit : input.toCharArray()) {
            int num = Character.getNumericValue(digit);
            digitCount[num]++;
        }
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] == 1) {
                uniqueDigits.add(i);
            }
        }
        return uniqueDigits;
    }
}

