package leetCode;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i =0; i<nums.length;i++)
        {
            for (int j =i+1 ; j<nums.length;j++)
            {
                if (nums[i]+nums[j]== target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int d[] = {1,2,6,8,7,5};
        TwoSum t=new TwoSum();
        System.out.printf(Arrays.toString(t.twoSum(d,4)));
    }
}
