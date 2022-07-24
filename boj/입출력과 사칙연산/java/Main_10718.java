package java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main_10718 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 2; i++) {
            bw.write("강한친구 대한육군\n");
            bw.flush();
        }
        bw.close();
    }
}