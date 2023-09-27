package baekJoon.SetNMap;

import java.io.*;
import java.util.*;

public class SetNMap10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Map<String, Integer> numberMap = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			numberMap.put(st.nextToken(), 1);
		}

		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < M; i++) {
			if (numberMap.containsKey(st2.nextToken())) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
		}
		System.out.println(sb.toString());
	}
}
