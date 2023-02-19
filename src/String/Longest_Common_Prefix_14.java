package String;

import java.util.Arrays;

public class Longest_Common_Prefix_14 {
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        System.out.println(commonPrefix(str));
    }

    private static String commonPrefix(String[] str) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length-1];
        int idx = 0;
        while(idx<s1.length() && idx<s2.length()){
            if(s1.charAt(idx)==s2.charAt(idx)){
                idx++;
            }else {
                break;
            }
        }
        return s1.substring(0,idx);
    }
}
