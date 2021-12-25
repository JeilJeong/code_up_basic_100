// root n을 사용한 방식은 아래 링크에서 확인 가능
//  https://st-lab.tistory.com/152

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i <= n; i++) {
            // for문의 범위를 n에서 root n으로 변경할 수 있으나, 여기서 n == 1일 때 조건문을 추가함으로써 반복 횟수를 줄임
            if (n == 1)
                break;
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        br.close();
    }
}