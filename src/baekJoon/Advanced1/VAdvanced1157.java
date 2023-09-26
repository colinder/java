package baekJoon.Advanced1;

import java.io.*;

// 알파벳을 입력받고 가장 많은 수의 알파벳을 대문자로 출력, 만약 2개 이상이라면 ? 출력

public class VAdvanced1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alpa = new int[26];
        String s = br.readLine().toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('A' <= c && c <= 'Z') {
                alpa[c - 'A']++;
            }
        }

        int max = 0;
        char result = '?';
        for (int j = 0; j < alpa.length; j++) {
            if (alpa[j] > max) {
                max = alpa[j];
                result = (char) ('A' + j);
            } else if (alpa[j] == max) {
                result = '?';
            }
        }

        System.out.println(result);

        br.close();

    }
}
