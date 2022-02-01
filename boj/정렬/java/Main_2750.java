import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2750 {
    public static int[] arr = null;
    public static int[] sorted = null;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        sorted = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        quick_sort_practice2(0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        br.close();
    }

    // j, j+1과 비교 O(n^2)
    // 192ms
    public static void bubble_sort(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    // 한 번 순회 시 min 값을 찾아 선택 후 삽입, O(n^2)
    // 192ms
    public static void selection_sort(int size) {
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(min, i);
            }
        }
    }

    // 한 번 순회 시 비교 연산을 통해 특정 값을 대소에 알맞게 위치에 삽입
    // 삽입정렬을 구현하였으나 효율적이지 않음, 196ms
    public static void insertion_sort(int size) {
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    for (int k = i - 1; k >= j; k--) {
                        arr[k + 1] = arr[k];
                    }
                    arr[j] = tmp;
                    break;
                }
            }
        }
    }

    // 삽입정렬 ver. 2 > best O(n), worst O(n^2)
    // 180ms
    public static void insertion_sort_v2(int size) {
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }

    /**
     * \
     * merge sort는 구현하기 쉬운 편에 속한다
     * 시간복잡도는 O(nlogn)이며, 이는 비교 연산이 몇 번 진행되는가에 대한 질문이다
     * 분할과정에서 공간복잡도, 데이터 복사 등에 들어가는 overhead는 고려되지 않는다, 고려되더라도 곱의 일부분으로서 계수로 들어간다
     * 재귀로 풀이
     * 196ms
     * @param start
     * @param end
     */
    public static void merge_sort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(start, mid);
            merge_sort(mid + 1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

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
     * for문 Test
     * @param start
     * @param end
     */
    // 하단의 for문이 merge_sort_v2마다 반복적으로 호출함으로써 오버헤드 발생
    public static void merge_sort_v2(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort_v2(start, mid);
            merge_sort_v2(mid + 1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;
            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && arr[p] < arr[q])) {
                    sorted[idx++] = arr[p++];
                } else {
                    sorted[idx++] = arr[q++];
                }
            }

            for (int i = start; i <= end; i++) {
                System.out.print(i + ", ");
                arr[i] = sorted[i];
            }
            System.out.println();
        }
    }

    // merge sort 구현 연습
    public static void merge_sort_practice(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort_practice(left, mid);
            merge_sort_practice(mid + 1, right);

            int l = left;
            int r = mid + 1;
            int idx = left;
            while (l <= mid || r <= right) {
                if (r > right || (l <= mid && arr[l] < arr[r])) {
                    sorted[idx++] = arr[l++];
                } else {
                    sorted[idx++] = arr[r++];
                }
            }

            for (int i = left; i <= right; i++) {
                arr[i] = sorted[i];
            }
        }
    }

    // merge sort 연습 두 번째
    public static void merge_sort_practice2(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort_practice2(start, mid);
            merge_sort_practice2(mid + 1, end);

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
     * ref : https://st-lab.tistory.com/233?category=892973
     * merge sort 다른 구현 방식 - 함수의 분리
     * @param left
     * @param right
     */
    public static void merge_sort_top_down(int left, int right) {
        if (left == right)
            return;

        int mid = (left + right) / 2;

        merge_sort_top_down(left, mid);
        merge_sort_top_down(mid + 1, right);

        merge(left, mid, right);
    }

    public static void merge(int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                sorted[idx++] = arr[l++];
            } else {
                sorted[idx++] = arr[r++];
            }
        }

        if (l > mid) {
            while (r <= right) {
                sorted[idx++] = arr[r++];
            }
        } else {
            while (l <= mid) {
                sorted[idx++] = arr[l++];
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }
    }

    /**
     * ref : https://st-lab.tistory.com/233?category=892973
     * 재귀를 사용하지 않고, for문으로 처리하는 merge sort
     * 180ms
     * @param left
     * @param right
     */
    public static void merge_sort_bottom_up(int left, int right) {
        for (int size = 1; size <= right; size += size) {
            for (int l = 0; l <= right - size; l += (2 * size)) {
                int low = l;
                int mid = l + size - 1;
                int high = Math.min(l + (2 * size) - 1, right);
                merge(low, mid, high);
            }
        }
    }

    /**
     * 시간복잡도 세타(nlogn) 빅오(n^2)
     * 특정 크기 이상의 정렬에서는 일반적으로 다른 nlogn 복잡도를 가지는 정렬 알고리즘보다 빠름
     * 그러나 기 정렬된 상태에서는 n^2으로 느림
     * 특정 사이즈 이하에서는 insertion sort가 가장 빠른 결과를 보여줌
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

    // quick sort 연습
    public static void quick_sort_practice(int left, int right) {
        int part = partition_practice(left, right);
        if (left < part - 1)
            quick_sort_practice(left, part - 1);
        if (part < right)
            quick_sort_practice(part, right);
    }

    public static int partition_practice(int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;
            if (left <= right) {
                swap(left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    // quick sort 연습 ver 2
    public static void quick_sort_practice2(int start, int end) {
        int part = partition_practice2(start, end);
        if (start < part - 1) {
            quick_sort_practice2(start, part - 1);
        }
        if (part < end) {
            quick_sort_practice2(part, end);
        }
    }

    public static int partition_practice2(int start, int end) {
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