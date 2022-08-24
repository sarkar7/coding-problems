package sarkar.algo.array;

public class RunningSum {


    static  int[] getRunningSum(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return arr;
        }

        int[] temp = new int[arr.length];
        temp[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            temp[i] = temp[i - 1] + arr[i];
        }

        return  temp;

    }


    public static void main(String[] args) {
        int[] arr = {};

        int[] sum = getRunningSum(arr);

        for(int s : sum) {
            System.out.print(s + " ");
        }
    }


}
