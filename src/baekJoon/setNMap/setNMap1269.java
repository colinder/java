package baekJoon.setNMap;

import java.io.*;
import java.util.*;

public class setNMap1269 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		HashSet<String> map = new HashSet<String>();
		
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			map.add(st2.nextToken());
		}
		
		int count = A;
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			if(map.contains(st3.nextToken())) {
				count -= 1;
			} else {
				count += 1;
			}
		}
		
		System.out.println(count);

	}
}
