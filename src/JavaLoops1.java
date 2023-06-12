/** Given an integer, N , print its first  10 multiples.
 * Each multiple N*i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.**/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JavaLoops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.printf("%d x %d = %d%n", N, i, result);
        }
    }
}

