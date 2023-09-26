package baekJoon.setNMap;

import java.io.*;
import java.util.*;

public class setNMap1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<String>();
		
		
		for (int i = 0; i < N; i++) {
			String t = br.readLine();
			map.put(t, 1);
		}

		for (int j = 0; j < M; j++) {
			String str = br.readLine();
			if (map.containsKey(str)) {
				list.add(str);
			}
		}
		
		Collections.sort(list);

		System.out.println(list.size());
		for (String e : list) {
            System.out.println(e);
        }
	}
}
