public class Star10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = i > 3 ? 6-i : i;

            for (int j = 1; j <= 5; j++) {
                if (j <= k) {
                    System.out.print("*");
                } else if (j <= 5 - k) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
