package loop;

import java.util.ArrayList;
import java.util.List;

public class MixdListDemo {
    public static void main(String[] args) {
        // 다양한 타입의 데이터가 들어있는 리스트 생성
        List<Object> mixedList = new ArrayList<>();
        mixedList.add(42); // int
        mixedList.add("Hello, World!"); // String
        mixedList.add(3.14); // double
        mixedList.add(true); // boolean

        // 리스트의 모든 요소를 출력
        for (Object item : mixedList) {
            System.out.print(item.getClass().getName() + " ");
            System.out.print(item + " "); // 42 Hello, World! 3.14 true 
        }
    }
}
