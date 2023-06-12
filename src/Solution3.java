
    import java.util.Scanner;

    public class Solution3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int integer = scanner.nextInt();
            double doub = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character after reading the double
            String str = scanner.nextLine();

            scanner.close();

            System.out.println("String: " + str);
            System.out.println("Double: " + doub);
            System.out.println("Int: " + integer);
        }
    }

