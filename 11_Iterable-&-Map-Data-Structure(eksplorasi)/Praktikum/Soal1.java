import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {
    public static void main(String[] args) {
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};

        String[] mergedArray = mergeAndRemoveDuplicates(array1, array2);

        System.out.println(Arrays.toString(mergedArray));
    }

    public static String[] mergeAndRemoveDuplicates(String[] array1, String[] array2) {
        List<String> mergedList = new ArrayList<>();

        mergedList.addAll(Arrays.asList(array1));
        for (String name : array2) {
            if (!mergedList.contains(name)) {
                mergedList.add(name);
            }
        }
        String[] mergedArray = mergedList.toArray(new String[0]);
        return mergedArray;
    }
}
