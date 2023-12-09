package Task88;

import java.util.Arrays;

public class MergeSortedArrayList {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[lastIndex] = nums1[m - 1];
                m -= 1;
            } else {
                nums1[lastIndex] = nums2[n - 1];
                n -= 1;
            }
            lastIndex -= 1;
        }
        while (n > 0) {
            nums1[lastIndex] = nums2[n - 1];
            n -= 1;
            lastIndex -= 1;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] numw1 = {1, 2, 3, 0, 0, 0, 0};
        int m = 3;
        int[] numw2 = {1, 1, 6, 6};
        int n = 4;
        System.out.println(Arrays.toString(merge(numw1, m, numw2, n)));
    }
}
