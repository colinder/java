package array;

public class LengthDemo {
    public static void main(String[] args) {

        String[] classGroup = new String[4]; // 4개의 string으로 이루어진 리스트를 만든다.
        classGroup[0] = "가가가";
        System.out.println(classGroup.length); // 4 length는 이 배열의 몇개의 값을 저장할 수 있는지 출력된다.
        classGroup[1] = "나나나";
        System.out.println(classGroup.length); // 4
        classGroup[2] = "다다다";
        System.out.println(classGroup.length); // 4

    }
}
