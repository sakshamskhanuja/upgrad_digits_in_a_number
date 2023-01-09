import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered number.
        int n = scanner.nextInt();

        // Stores how many digits are there in n.
        int digits = 0;

        do {
            n /= 10;
            digits++;
        } while (n > 0);
        System.out.println(digits);
    }
}