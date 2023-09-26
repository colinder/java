package baekJoon.String;

import java.io.*;
import java.util.*;

public class VString27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 문자열 리스트로 입력 받기
        String[] s = br.readLine().split("");
        System.out.println(Arrays.toString(s));

        // 일반 풀이
        String ss = br.readLine();

        int i = Integer.parseInt(br.readLine());
        System.out.println(ss.charAt(i-1));

        br.close();
    }
}
