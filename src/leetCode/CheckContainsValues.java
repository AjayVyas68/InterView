package leetCode;

import java.util.HashSet;
import java.util.Set;

public class CheckContainsValues {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (check.contains(nums[i])) {
                return true;
            }
            check.add(nums[i]);

        }

        return false;
    }

    public static void main(String[] args) {
        CheckContainsValues c = new CheckContainsValues();
        int[] j = new int[]{1, 2, 3};
        c.containsDuplicate(j);
        System.out.println(c.containsDuplicate(j));
    }
}
