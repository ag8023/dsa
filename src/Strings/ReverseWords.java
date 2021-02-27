package Strings;

public class ReverseWords {
    public String reverseWords(String s) {
        String [] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length -1; i>=0; i--)
        {
            if(str[i].length() >0)
                sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }

}
