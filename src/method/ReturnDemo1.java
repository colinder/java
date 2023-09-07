package method;

public class ReturnDemo1 {
    public static String numbering(int init, int limit) {
        String output = "";
        int i = init;
        while(i < limit) {
            System.out.println(i);
            output += i;
            i++;            
        }
        return output;
    }

    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result.getClass().getName()); // type 확인 함수 .getClass().getName()
    }
}
