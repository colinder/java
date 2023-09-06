public class EqualDemo {
  public static void main(String[] agrs) throws Exception {
    boolean a = false;
    System.out.println("a는 불리언이고 " + a); // false
    System.out.println(1 == 2); // false
    System.out.println(1 == 1); // true
    System.out.println("one" == "two"); // false
    System.out.println("one" == "one"); // true
    
    System.out.println(1 != 2); // true
    System.out.println(1 != 1); // false
    System.out.println("one" != "two"); // true
    System.out.println("one" != "one"); // false
  }
  
}
