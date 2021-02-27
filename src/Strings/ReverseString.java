package Strings;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length -1;
        char c;
        while(left<=right)
        {
            c = s[left];
            s[left++] = s[right];
            s[right--] = c;
        }
    }
}
