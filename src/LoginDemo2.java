public class LoginDemo2 {
    public static void main(String[] args) {
        String id = args[0];
        String pw = args[1];
        
        if (id.equals("egoing")) {
            if (pw.equals("111111")) {
                System.out.println("right");
            } else {
                System.out.println("Worng");
            }
        } else {
            System.out.println("wrong");
        }
    }
}
