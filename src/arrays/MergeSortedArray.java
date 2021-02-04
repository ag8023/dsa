package src.arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        MergeSortedArray mergeArray = new MergeSortedArray();
        int [] nums1 = new int[] {1,2,3,0,0,0};
        int [] nums2 = new int[] {2,5,6};
        int m = 3, n = 3;
        mergeArray.merge(nums1, m, nums2, n);
        System.out.println("The merged array is: " );
        for(int i : nums1)
            System.out.print(i + "\t");

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, temp;

        while(i < m && j < n)
        {
            if(nums1[i] <= nums2[j])
            {
                i++;
            }
            else
            {
                temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                j++;
            }
        }
        j=0;
        for(int k = m; k < nums1.length; k++)
        {
            nums1[k] = nums2[j];
            j++;
        }
    }
}
