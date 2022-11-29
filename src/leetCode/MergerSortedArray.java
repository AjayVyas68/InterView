package leetCode;

public class MergerSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        int end1 = m - 1;
        int end2 = n - 1;

        while (end2 >= 0) {
            if (end1 >= 0) {
                nums1[end--] = nums1[end1] > nums2[end2] ? nums1[end1--] : nums2[end2--];
            } else {
                nums1[end--] = nums2[end2--];
            }
        }


    }


    public static void main(String[] args) {
        MergerSortedArray m = new MergerSortedArray();
        int[] a = {1, 5, 6, 9, 8, 4};
        System.out.println(a.length);
        int[] b = {1, 6, 4};
        m.merge(a, 4, b, 2);
        System.out.println(m.toString());
    }
}
