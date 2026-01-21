import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // number of test cases
        sc.nextLine();          // consume leftover newline

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even.append(s.charAt(j));
                } else {
                    odd.append(s.charAt(j));
                }
            }

            System.out.println(even + " " + odd);
        }

        sc.close();
    }
}
