package sarkar.gfg.array;

import java.util.ArrayList;

public class MaxOfAllSubArrayBySizeK {

    //Function to find maximum of each subarray of size k.
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[0];
        for (int i = 1; i < k; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        list.add(max);
        int f_idx = 0;
        int l_idx = k - 1;
        while (l_idx < n) {
            if (arr[f_idx] == max && arr[l_idx + 1] >= max) {
                max = arr[l_idx + 1];
            }
            list.add(max);
            f_idx++;
            l_idx++;
        }


        return list;
    }

}
