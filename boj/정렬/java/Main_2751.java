import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 1st try : merge sort + sysout = 시간 초과
 * 2nd try : quick sort + sysout = 시간 초과
 * 3rd try : quick sort + bw = 시간 초과(bw로 이전보다 향상은 있었느나 quick sort의 n^2 케이스에서 걸림)
 * 4th try : merge sort + bw = 1024ms 통과
 */

public class Main_2751 {
    public static int[] arr = null;
    public static int[] sorted = null;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        sorted = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        /**
         * ref : https://brandpark.github.io/java/2021/01/05/arrays_sort1.html
         * Arrays.sort : arg가 primitive type인 경우 내부적으로 dual-pivot quick sort를 사용
         * 그러나 세부적인 사항은 배열의 크기에 따라 다르며, Object type인 경우 Tim sort를 사용
         * 자바 11 기준 : 1628ms
         */
        //Arrays.sort(arr);

        /**
         * 직접 구현한 merge sort로 통과
         */
        //merge_sort(0, n - 1);

        /**
         * 주의 : 상단에서 list를 생성한 후 sorting을 진행해야 함
         * 내부적으로 Tim sort(insertion sort + merge sort)를 구현하고 있다고 함
         */
        //Collections.sort(list);

        for (int i = 0; i < n; i++) {
            bw.append(arr[i] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    private static void merge_sort(int start, int end) {
        if (start < end) {
            // index mid 값 설정
            int mid = (start + end) / 2;
            merge_sort(start, mid);
            merge_sort(mid + 1, end);

            int p = start;
            int q = mid + 1;
            int idx = start;
            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && arr[p] < arr[q])) {
                    sorted[idx++] = arr[p++];
                } else {
                    sorted[idx++] = arr[q++];
                }
            }

            for (int i = start; i <= end; i++) {
                arr[i] = sorted[i];
            }
        }
    }

    /**
     * 시간복잡도 세타(nlogn) 빅오(n^2)
     * 특정 크기 이상의 정렬에서는 일반적으로 다른 nlogn 복잡도를 가지는 정렬 알고리즘보다 빠름
     * 그러나 기 정렬된 상태에서는 n^2으로 느림
     * 특정 사이즈 이하에서는 insertion sort가 가장 빠른 결과를 보여줌
     *
     * @param start
     * @param end
     */
    public static void quick_sort(int start, int end) {
        int part = partition(start, end);
        if (start < part - 1)
            quick_sort(start, part - 1);
        if (end > part)
            quick_sort(part, end);
    }

    public static int partition(int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;
            if (start <= end) {
                swap(start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}