package baekJoon.String;

import java.io.*;
import java.util.*;

public class VString1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 초간단방법.. token은 공백을 자동으로 처리해 준다. 또 문장이 없다면 0을 반환
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());

        // 앞뒤 공백을 제거하고 공백으로 띄어진 단어의 갯수, 단 trim 사용시 빈 문장의 경우 1로 반환
        // String t = s.trim();
        
        // if (t == "") {
        //     System.out.println(0);
        // } else {
        //     String[] arr = t.split(" ");
        //     System.out.println(arr.length);
        // }

        br.close();
    }
}
