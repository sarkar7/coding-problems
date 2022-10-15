package sarkar.gfg.array;

import java.util.*;

public class TwoSum {

    public pair[] allPairs(long A[], long B[], long N, long M, long X) {
        Map<Long, Long> map = new HashMap<>();
        ArrayList<pair> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            map.put(X - A[i], A[i]);
        }

        for (int j = 0; j < M; j++) {
            if (map.containsKey(B[j])) {
                list.add(new pair(map.get(B[j]), B[j]));
            }
        }
        pair[] temp = list.toArray(new pair[0]);
        Arrays.sort(temp, (o1, o2) -> (int) (o1.first - o2.first));
        return temp;
    }

    public static void main(String[] args) {
        long[] A = {1, 2, 4, 5, 7};
        long[] B = {5, 6, 3, 4, 8};
        int X = 9;
        TwoSum obj = new TwoSum();

        pair[] pairs = obj.allPairs(A, B, A.length, B.length, X);
        for (pair i : pairs) {
            System.out.println(i.first+", "+i.second);
        }


    }


    class pair {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }

}
