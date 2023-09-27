package baekJoon.SetNMap;

import java.io.*;
import java.util.*;

public class SetNMap10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<String, Integer> sMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String t = st.nextToken();
			if (sMap.containsKey(t)) {
				int temp = sMap.get(t);
				sMap.put(t, temp+1);
			} else {
				sMap.put(t, 1);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			String t = st2.nextToken();
			if (sMap.containsKey(t)) {
				bw.write(sMap.get(t) + " ");
			} else {
				bw.write("0 ");

			}
		}
		bw.write("\n");
		bw.flush();
	}
	
}
