package condition;
public class ElseIfDemo {
    public static void main(String[] args) {
        boolean value = true;
        
        if (value) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        } else {
            System.out.println(5);
        }


        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
