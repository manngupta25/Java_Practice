import java.util.Scanner;

public class reverseStarpattern {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        // Size of the pyramid
        int number = scanner.nextInt();
        int i, j;

        // Outer loop handle the number of rows
        for (i = number; i >= 1; i--) {

            // Inner loop print space
            for (j = i; j < number; j++) {
                System.out.print(" ");
            }

            // Inner loop print star
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println("");
        }
    }
}
