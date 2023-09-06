public class PrePostDemo {
  public static void main(String[] args) throws Exception {
    int i = 3;
    i++;

    System.out.println(i); // 4
    ++i;
    System.out.println(i); // 5
    System.out.println(++i); // 6
    System.out.println(i++); // 6  println이 동작한 후 i++이 동작해 숫자는 유지 이후 i가 변경된 것이 반영됨.
    System.out.println(i); // 7

    System.out.println("Hello, World!");
}
}
