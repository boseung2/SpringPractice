public class Mission {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean isSame = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isSame = false;
            }
        }
        System.out.println(isSame ? "같습니다." : "다릅니다.");




        int[] arr3 = {1, 3, 4};
        int[] arr4 = {1, 2, 3};
        int count = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr3[i] == arr4[j]) {
                    count++;
                }
            }
        }
        System.out.println("중복된 숫자는 " + count + "개 입니다.");



        int[] answer = {3, 2, 1};
        int[] input = {1, 2, 4};
        int s = 0;
        int b = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if(i == j && input[i] == answer[i]) {
                    s++;
                }
                if(i != j && input[i] == answer[j]) {
                    b++;
                }
            }
        }
        System.out.println(s + "S" + b + "B");
    }
}
