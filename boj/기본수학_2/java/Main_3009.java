// 의도적으로 클래스를 구성하는 연습을 진행함

// 152ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Coordinator> coord = new ArrayList<Coordinator>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coord.add(new Coordinator(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Coordinator result = find_remain_contour(coord);

        result.print_coord();

        br.close();
    }

    public static Coordinator find_remain_contour(ArrayList<Coordinator> coords) {
        int x1 = coords.get(0).getX();
        int x2 = coords.get(1).getX();
        int x3 = coords.get(2).getX();
        int y1 = coords.get(0).getY();
        int y2 = coords.get(1).getY();
        int y3 = coords.get(2).getY();

        int resultX = 0;
        int resultY = 0;
        if (x1 == x2)
            resultX = x3;
        else if (x1 == x3)
            resultX = x2;
        else if (x2 == x3)
            resultX = x1;

        if (y1 == y2)
            resultY = y3;
        else if (y1 == y3)
            resultY = y2;
        else if (y2 == y3)
            resultY = y1;

        Coordinator result = new Coordinator(resultX, resultY);

        return result;
    }
}

class Coordinator {
    private int x;
    private int y;

    public Coordinator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print_coord() {
        System.out.println(this.x + " " + this.y);
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}