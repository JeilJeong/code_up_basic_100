// 200ms

// 에라토스네의 체 사용하기

public class Main_4673 {
    public static void main(String[] args) {
        int[] arr = new int[10001];
        for (int i = 1; i < 10001; i++) {
            int test = i;
            while (true) {
                int num = test;
                while (num > 0) {
                    test += num % 10;
                    num /= 10;
                }
                if (test > 10000)
                    break;
                arr[test] = 1;
            }
        }
        for (int i = 1; i < 10001; i++)
        {
            if (arr[i] == 0)
                System.out.println(i);
        }
    }
}