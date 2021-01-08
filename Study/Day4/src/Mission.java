public class Mission {
    public static void main(String[] args) {
        int[] numArr = {4, 7, 1, 1, 3, 7, 6, 2, 4, 4, 2, 8, 3, 9, 2};
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < counter.length; i++) {
            for(int j = 0; j < counter[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
