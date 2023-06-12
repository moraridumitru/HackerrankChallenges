import java.util.*;
import java.io.*;

class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
/**In this code, after reading the number of queries t, we iterate t times to process each query.
 * For each query, we read the values of a, b, and n.

 Inside the loop, we initialize a variable sum with the value of a. Then, we iterate from 0 to n-1 to calculate
 the series. In each iteration, we add the corresponding term to the sum using the formula (2^j) * b and print it.
 The term (2^j) * b represents the j-th term in the series. Finally, we print a newline character after each series to
 separate them.
 By following this approach, the program will calculate and print the series for each query based on the given values
 of a, b, and n.**/