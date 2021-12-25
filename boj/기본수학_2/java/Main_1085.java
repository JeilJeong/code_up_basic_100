import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // 상하좌우 선분의 좌표값을 매칭: 상(h)=y값 비교, 하(0)=y값 비교, 좌(0)=x값 비교, 우(w)=x값 비교
        int[] comp = new int[4];
        comp[0] = Math.abs(h - y);
        comp[1] = Math.abs(0 - y);
        comp[2] = Math.abs(0 - x);
        comp[3] = Math.abs(w - x);

        int min = 1001;
        for (int i = 0; i < 4; i++) {
            if (comp[i] < min)
                min = comp[i];
        }
        System.out.println(min);
        br.close();
    }
}