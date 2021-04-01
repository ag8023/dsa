package arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        int[] newInt = new int[len+2];
        for(int i  = len; i >=0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        newInt[0] = 1;
        return newInt;
    }
}
