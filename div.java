import java.util.Scanner;

public class div {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int div = a / b;
        System.out.println(div);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x= scanner.nextInt();
        System.out.println("Enter Another Number:");
        int y = scanner.nextInt();
        System.out.println("Divide is " + div);
    }
}
