package swea.D2;

import java.io.*;
import java.util.*;

public class swea1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());  // 1리터 당 가격 - A사
            int Q = Integer.parseInt(st.nextToken());  // R리터 이하 요금 - B사
            int R = Integer.parseInt(st.nextToken());  // 기준 요금 - B사
            int S = Integer.parseInt(st.nextToken());  // R리터 이상 1리터 당 가격 - B사
            int W = Integer.parseInt(st.nextToken());  // 사용량


            int A = P*W;

            int B = Q;
            if (W > R) {
                B += (W - R)*S;
            }
            
            int result = (A<B ? A : B);

            System.out.println("#"+(i+1)+" "+result);
        }
    }
}
