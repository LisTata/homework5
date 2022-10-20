import java.util.Arrays;

public class For35 {
    public static void main(String[] args) {
      /*Дано целое число N (> 2). Последовательность целых чисел AK определяется следующим образом:
A1 = 1, A2 = 2, A3 = 3,
AK = AK−1 + AK−2 − 2·AK−3, K = 4, 5, . . . .
Вывести элементы A1, A2, . . . , AN*/
        int n = 7;

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 3; i < n; i++) {
            for (int k = i; k <= n; ) {
                arr[i] = arr[k - 1] + arr[k - 2] - 2 * arr[k - 3];
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}