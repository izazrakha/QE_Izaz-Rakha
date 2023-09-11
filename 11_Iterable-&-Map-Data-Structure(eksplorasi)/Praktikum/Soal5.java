public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 3, 3, 6, 9, 9};
        int length1 = removeDuplicates(nums1);
        System.out.println("Length after removing duplicates: " + length1);

        int[] nums2 = {2, 2, 2, 11};
        int length2 = removeDuplicates(nums2);
        System.out.println("Length after removing duplicates: " + length2);
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
