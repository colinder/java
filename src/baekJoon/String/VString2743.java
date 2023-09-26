package baekJoon.String;

import java.io.*;

public class VString2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열을 리스트로 입력받아 길이 추출
        String[] s = br.readLine().split("");
        System.out.println(s.length);

        // 문자열로 입력 받아 길이 추출
        String se = br.readLine();
        System.out.println(se.length());

        br.close();
    }
}
