public class Star8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j <= 5 - i) {
                    System.out.print(" ");
                } else if (j <= 4 + i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
