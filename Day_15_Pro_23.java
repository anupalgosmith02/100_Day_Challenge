import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int maxCount = 0;
        int currentCount = 0;

        while (n > 0) {
            if (n % 2 == 1) {          // if last bit is 1
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;     // reset when bit is 0
            }
            n = n / 2;                // move to next bit
        }

        System.out.println(maxCount);

        bufferedReader.close();
    }
}
