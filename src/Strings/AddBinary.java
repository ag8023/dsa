package Strings;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;
        while( i >= 0 || j >= 0)
        {
            sum = carry;
            // char -> ASCII value: '0' -> 48, '1' -> 49,
            // e.g., subtract '0' from '1' and we have 1
            if(i >= 0)
                sum+= a.charAt(i--) - '0';
            if(j >= 0)
                sum+= b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum/2;
        }
        if(carry!=0)
            sb.append(carry);
        return sb.reverse().toString();
    }

}
