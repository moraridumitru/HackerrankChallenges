import java.util.*;
import java.security.*;

public class Solution {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            String s = String.valueOf(n);

            if (s.equals(String.valueOf(n))) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Wrong answer");
        }
    }
}