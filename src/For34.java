public class For34 {
    /*Дано целое число N (> 1). Последовательность вещественных чисел AK
определяется следующим образом:
A1 = 1, A2 = 2, AK = (AK−2 + 2·AK−1)/3, K = 3, 4, . . . .
Вывести элементы A1, A2, . . . , AN .
*/
    public static void main(String[] args) {
        int n = 7;

        double[] arr = new double[n];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr[0]);
        System.out.println(arr[1]);


        for (int i = 2; i < n; i++) {
            for (int k = i; k <= n; ) {
                arr[i] = (arr[k - 2] + 2 * arr[k - 1]) / 3;
                break;
            }

            System.out.printf("%.2f,%n", arr[i]);


        }
    }
}
