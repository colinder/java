package method;

public class ReturnDemo2 {
    public static String[] getMembers() {
        String[] members = {"가가가", "나나나", "다다다"};
        return members;
    }

    public static void main(String[] args) {
        String[] Members = getMembers();

        for (String item: Members) {
            System.out.print(item.toString());
        }
    }
}
