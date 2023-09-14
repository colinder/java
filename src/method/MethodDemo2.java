package method;

public class MethodDemo2 {
    public static boolean numbering() {
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
            if( i == 3) {
                System.out.println("이제 종료?");
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        numbering();
    }
}
