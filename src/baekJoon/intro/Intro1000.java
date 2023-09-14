package baekJoon.intro;

import java.io.*;

public class Intro1000 {
    static double a, b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);

        System.out.println(a/b);
        br.close();

        // System.out.println(b);

        // Scanner scanner = new Scanner(System.in);
          
        // String inputLine = scanner.nextLine(); // 사용자 입력을 한 줄로 받음
        
        // // 띄어쓰기로 구분하여 문자열을 리스트에 저장
        // List<String> inputList = new ArrayList<>();
        // String[] tokens = inputLine.split(" "); // 띄어쓰기로 분리
        // for (String token : tokens) {
        //     inputList.add(token);
        // }
        
        // // 리스트에 저장된 값 출력
        // System.out.println("입력된 값들:");
        // for (String value : inputList) {
        //     System.out.println(value);
        // }
        
        // scanner.close(); // 스캐너 닫기
    }
}
