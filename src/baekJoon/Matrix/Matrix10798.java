package baekJoon.Matrix;

import java.io.*;
import java.util.*;

public class Matrix10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Object[][] arr = new Object[5][15];
        
        for (int i = 0; i < 5; i++) {
            String st = br.readLine();
            for (int j = 0; j < st.length(); j++) {
                arr[i][j] = st.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] == null) {
                    continue;
                }
                bw.write(String.valueOf(arr[i][j]));
            }
        }

        br.close();
        bw.flush();
        bw.close();

        

    }
}
