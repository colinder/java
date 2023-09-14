package array;

public class DefineDemo {
    public static void main(String[] args) {
        String[] classGroup = {"가가가", "나나나", "다다다", "마마마"};
        System.out.println(classGroup.length);
        System.out.println(classGroup[0]);
        System.out.println(classGroup[2]);

        classGroup[1] = "새롭다";
        System.out.println(classGroup[1]);
    }
}
