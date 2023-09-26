package baekJoon.setNMap;

import java.io.*;
import java.util.*;

public class setNMap14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> sMap = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String t = br.readLine();
			sMap.put(t, 1);
		}

		int count = 0;
		for (int i = 0; i < M; i++) {
			if (sMap.containsKey(br.readLine())) {
				count += 1;
			}
		}

		System.out.println(count);
	}
}
