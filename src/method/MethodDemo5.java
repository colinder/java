package method;

public class MethodDemo5 {
    public static void numbering(int limit, String comment) {
        System.out.println(comment);
        int i = 0;
        while(i < limit) {
            System.out.println(i);
            i++;
            
        }
    }

    public static void main(String[] args) {
        numbering(3, "두번째");
    }
}
