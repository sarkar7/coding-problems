package sarkar.gfg.array;

public class MoveZeros {

    void pushZerosToEnd(int[] arr, int n) {
        int tail = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[tail];
                arr[tail] = temp;
                tail--;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros obj = new MoveZeros();
        int[] arr = {15, 12, 0, 0, 0, 2, 2, 19, 6, 17, 16, 20, 0, 2, 16, 0, 10, 0, 14, 15};
        obj.pushZerosToEnd(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

}
