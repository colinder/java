// switch는 조건에 맞는 순서가 실행되고 그 뒤의 모든 case가 실행된다.

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
        case 2:
            System.out.println("two");
        case 3:
            System.out.println("three");
        }

        

        System.out.println("switch(2)");
        switch(3){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break; // switch문 종료
        case 3:
            System.out.println("three");
            // break;
        case 4:
            System.out.println("four");
            break;
        default: // 부여한 조건에 아무것도 맞지 않을 때 default가 발동
            System.out.println("DEFAULT");
        }
    }
}
