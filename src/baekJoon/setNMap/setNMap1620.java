package baekJoon.SetNMap;

import java.io.*;
import java.util.*;

public class SetNMap1620 {
	private static Map<String, Object> map;

	public void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		map = new HashMap<String, Object>();

		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			map.put(s, i);
			map.put(String.valueOf(i), s);
		}

		for (int i = 0; i < M; i++) {
			String a = br.readLine();
			System.out.println(map.get(a));
		}

	}
}
