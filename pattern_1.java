public class pattern_1 {

    public static void main(String[] args) {
        int i, j;
        int n = 10;
        for (i = n; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}