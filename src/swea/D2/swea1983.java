package swea.D2;

import java.io.*;
import java.util.*;

public class swea1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());// 학생 수
            int K = Integer.parseInt(st.nextToken());// 알고싶은 학생

            Double[] arr = new Double[N];
            double t = 0.0;

            for (int j = 0; j < arr.length; j++) {
                double temp = 0;
                StringTokenizer scores = new StringTokenizer(br.readLine());
                temp += Integer.parseInt(scores.nextToken()) * 0.35 + Integer.parseInt(scores.nextToken())* 0.45 + Integer.parseInt(scores.nextToken())* 0.20;
                
                arr[j] = temp;

                if (j+1 == K) t = temp;
            }
            
            Arrays.sort(arr, Collections.reverseOrder());

            // System.out.println(Arrays.toString(arr));

            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == t) {
                    index = j;
                }
            }

            System.out.println("#"+(i+1)+" "+grade[index/(N/10)]);
        }
    } 
}
