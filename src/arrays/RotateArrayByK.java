package arrays;

public class RotateArrayByK {
    public int[] rotateArray(int [] arr, int k)
    {

       reverse(arr, 0, k-1);
       reverse(arr, k, arr.length - 1);
       reverse(arr, 0, arr.length-1);

       return arr;
    }

    public void reverse(int [] arr, int start, int end)
    {
        int temp;
        while(start <= end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
