public class Star9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = i > 3 ? 6-i : i;

            for (int j = 1; j <= 5; j++) {
                if (j <= k - 1) {
                    System.out.print(" ");
                } else if (j <= 6 - k) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
