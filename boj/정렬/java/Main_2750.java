import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2750 {
    public static int[] arr = null;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            arr2[i] = arr[i];
        }

        insertion_sort(arr2[i], 0, n);

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
     * @param start
     * @param end
     */
    public static void merge_sort(int start, int end) {

    }

    public static void quick_sort(int size) {

    }

    public static void heap_sort(int size) {

    }

    public static void swap(int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}