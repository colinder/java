import java.io.*;
import java.util.StringTokenizer;

public class App {

    public static int simulate() throws IOException {
        int a = 1;
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(st.nextToken());

        System.out.println("Hello, World!");
        int a = 123;

        if (""+a instanceof String) {
            System.out.println("String");
        }
    }

    
}
