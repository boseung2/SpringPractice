public class Mission {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d \t %d \t %d \n", i + 1, i % 3 + 1, i / 3 + 1);
        }
    }
}
