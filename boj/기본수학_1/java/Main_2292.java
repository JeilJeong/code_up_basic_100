// 1 = 1 : 1개
// 2 3 4 5 6 7 = 2 : 6개
// 8 9 10 11 12 13 14 15 16 17 18 19 = 3 : 12개
// 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 = 4 : 18개

// 서클 당 6개씩 증가, 단 1을 제외하고
// Key 1 : 2개의 logic을 생각해야 함, 1차 내부 숫자의 증가와 2차 숫자 개수의 증가량
// key 2 : 2차 count의 증가는 규칙성이 존재
// key 3 : 그러나 특정 Input의 값의 count를 바로 알아낼 수는 없다
// 1차 내부 숫자의 첫 원소를 보면 얼핏 증가하는 것처럼 보이고, 규칙성도 있어 보이나
// 특정 시점에 2차를 얼만큼 증가시켜야 할지 알 수 없음 : 따라서 순차적으로 while문을 써서 증가시켜서 확인

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println(1);
            return;
        }
        int count = 1;
        int sum = 2;
        while (sum < num) {
            sum += 6 * count;
            count += 1;
        }
        if (sum == num) {
            System.out.println(count + 1);
        } else {
            System.out.println(count);
        }
        br.close();
    }
}