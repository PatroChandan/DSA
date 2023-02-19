package String;

import java.util.Scanner;

public class AddStrings_415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(addString(str1,str2));
    }
    private static String addString(String str1,String str2) {
        String res ="";
        int i = str1.length()-1;
        int j = str2.length()-1;

        int carry=0;
        while(i>=0 || j>=0 || carry != 0){
            int ival = i>=0?str1.charAt(i)-'0':0;
            int jval = j>=0?str2.charAt(j)-'0':0;
            i--;
            j--;
            int sum = ival+jval+carry;
            res = (sum%10)+res;
            carry = sum/10;
        }

        return res;
    }
}
