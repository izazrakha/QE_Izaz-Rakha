import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayUnique {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};

        int[] result = findUniqueElements(array1, array2);

        System.out.println(Arrays.toString(result));
    }

    public static int[] findUniqueElements(int[] array1, int[] array2) {
        Set<Integer> set2 = new HashSet<>();
        for (int num : array2) {
            set2.add(num);
        }

        List<Integer> uniqueElements = new ArrayList<>();

        for (int num : array1) {
            if (!set2.contains(num)) {
                uniqueElements.add(num);
            }
        }

        int[] result = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;
    }
}
