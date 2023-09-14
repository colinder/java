package loop;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++) {
            if (i == 5) {
                continue;// 이후 반복문 코드 동작을 막음. loop는 계속 진행
            }
            System.out.println(i);
        }
    }
}
