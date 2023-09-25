package baekJoon.setNMap;

import java.io.*;
import java.util.*;

public class setNMap7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Map<String, String> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status = st.nextToken();
			if (status.equals("leave")) {
				map.remove(name);
			} else {
				map.put(name, status);
			}
		}

		// Map -> List
        Collection<String> values = map.keySet();
        List<String> list = new ArrayList<>(values);
		
		Collections.sort(list, Collections.reverseOrder());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
