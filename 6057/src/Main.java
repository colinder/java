import java.io.*;
import java.util.*;
 
public class Main {
    static List<Integer>[] graph;
    static boolean[] v;
    static int N, M;
    static int answer;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int T = Integer.parseInt(br.readLine());
         
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
         
        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
             
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
             
            graph = new ArrayList[N + 1];
            v = new boolean[N + 1];
            for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();
             
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());                
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());               
                graph[x].add(y);
                graph[y].add(x);
            }
             
            answer = 0;
            for (int i = 1; i <= N - 2; i++) {
                for (int j = i + 1; j <= N - 1; j++) {
                    for (int k = j + 1; k <= N; k++) {
                        if (graph[i].contains(j) && graph[j].contains(k) && graph[k].contains(i)) {
                            answer++;
                        }
                    }
                }
            }
             
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
         
        bw.write(sb.toString());        
        br.close();
        bw.flush();
        bw.close();
    }
     
}