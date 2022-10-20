import java.util.Arrays;

public class For33 {
    /* Дано целое число N (> 1). Последовательность чисел Фибоначчи FK
(целого типа) определяется следующим образом:
F1 = 1, F2 = 1, FK = FK−2 + FK−1, K = 3, 4, . . . .
Вывести элементы F1, F2, ..., FN*.*/
    public static void main(String[] args) {
        int n = 7;

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;


        for (int i = 2; i < n; i++) {
            for (int k = i; k <= n; ) {
                arr[i] = arr[k - 2] + arr[k - 1];
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

}
