// ref > https://st-lab.tistory.com/96

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, n) - 1)).append('\n');

        hanoi(n, 1, 2, 3);
        System.out.println(sb);

        br.close();
    }

    /*
        n = 원판의 개수
        start = 출발 막대
        mid = 옮기기 위한 중간 막대
        to = 목적지 막대
     */

    public static void hanoi(int n, int start, int mid, int to) {
        // 이동할 원반의 수가 1일 때
        if (n == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        //step 1 : n-1개를 a에서 b로 이동
        hanoi(n - 1, start, to, mid);

        //step 2 : 1개를 a에서 c로 이동
        sb.append(start + " " + to + "\n");

        //step 3 : n-1개를 b에서 c로 이동
        hanoi(n - 1, mid, start, to);
    }
}