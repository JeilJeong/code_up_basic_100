// key : input까지 compare를 통해 수를 증가시키며, 몇 번째 cycle에 해당하는지 확인 후 해당 cycle의 홀짝 여부에 따라 top, bottom 값 insert

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int compare = 0;
        int diff = 0;
        while (compare < num) {
            diff += 1;
            compare += diff;
        }
        int top = 0;
        int bottom = 0;
        if (diff % 2 == 0) {
            top = num - (compare - diff);
            bottom = (compare - num) + 1;
        } else {
            top = (compare - num) + 1;
            bottom = num - (compare - diff);
        }
        System.out.println(top + "/" + bottom);
        br.close();
    }
}