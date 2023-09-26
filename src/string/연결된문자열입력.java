package string;

import java.io.*;

public class 연결된문자열입력 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());
        int M  = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][M];

        for (int j = 0; j < N; j++) {
            String line = br.readLine();
            for (int j2 = 0; j2 < M; j2++) {
                arr[j][j2] = line.charAt(j2) + "";
            }
        }
    }
}
