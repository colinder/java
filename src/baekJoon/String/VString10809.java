package baekJoon.String;

import java.io.*;

public class VString10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = br.readLine();

        // char tpye이면 알파벳도 순회가 가능!
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(s.indexOf(i) + " ");
        }
        System.out.println(sb);

    }
}
