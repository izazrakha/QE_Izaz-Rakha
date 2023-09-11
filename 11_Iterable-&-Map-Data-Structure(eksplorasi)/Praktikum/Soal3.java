import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] result1 = findTwoSum(numbers1, target1);
        System.out.println(Arrays.toString(result1));
        int[] numbers2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] result2 = findTwoSum(numbers2, target2);
        System.out.println(Arrays.toString(result2));
    }
    public static int[] findTwoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
