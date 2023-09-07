package Loop;

public class ArrayLoopDemo {
    public static void main(String[] args) {
        String[] members = {"가가가", "나나나", "다다다"};
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + " 가(이) 상담받음.");
        }
    }
}
