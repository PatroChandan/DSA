package NS_Contest;

import java.util.Scanner;

/**
 * We are given a string. Your task is to compress the consecutive letters of the string
 *
 * For example, given string is "AAACCCBBD", thus here
 * A's occurrence 3 times
 * C's occurrence 3 times
 * B's occurrence 2 times
 * D's occurrence 1 time
 * So after compressing string becomes "A3C3B2D1".
 * @Input
 * The first line of input contains an integer T denoting the number of test cases. Each test case will have a string provided in the new line.
 *
 * Constraints:
 * 1 <= T <= 10
 * 1 <= sizeof(String) <= 10^6
 * All characters of String are upper case letters. (A-Z)
 *
 * Sum of size of Strings over all testcases is <= 10^6
 * @Output
 * For each testcase, in a new line, print the compressed string for each test case in a new line.
 * Example
 * @Input:
 * 2
 * AAACCCBBD
 * ABCD
 *
 * @Output:
 * A3C3B2D1
 * A1B1C1D1
 */
public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            String str = sc.next();
            int count = 0;
            for(int i=0;i<str.length();i++){
                count++;
                if(i==str.length()-1 || str.charAt(i)!=str.charAt(i+1)){
                    System.out.print(str.charAt(i)+""+count);
                    count=0;
                }
            }
            System.out.println();
        }

    }
}
