// ref
//  https://st-lab.tistory.com/90

// 각 반지름을 갖는 두 원의 교점을 찾는다.
// key : double형의 오차를 조심할 것, 그리고 6가지의 경우로 분류

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            // 6가지 경우로 분류

            int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // 1) 무수히 많은 경우(원의 중심이 같고, 반지름도 같을 때)
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }

            // 2) 접점이 없는 경우
            // 2-1) 바깥에 존재하는 경우(두 점 사이의 거리가 각 원의 반지름의 합보다 클 때)
            else if (distance > Math.pow(r2 + r1, 2)) {
                System.out.println(0);
            }

            // 2-2) 안에 존재하는 경우(한 원 안에 다른 원이 있으면서 접점이 없을 때)
            else if (distance < Math.pow(r2 - r1, 2)) {
                System.out.println(0);
            }

            // 3) 접점이 한 개일 때
            // 3-1) 내접할 떄
            else if (distance == Math.pow(r2 - r1, 2)) {
                System.out.println(1);
            }

            // 3-2) 외접할 때
            else if (distance == Math.pow(r1 + r2, 2)) {
                System.out.println(1);
            }

            // 4) 나머지는 모두 2개의 접점이 존재하는 경우이다
            else {
                System.out.println(2);
            }
        }
        br.close();
    }
}