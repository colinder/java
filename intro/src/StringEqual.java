public class StringEqual {
  public static void main(String[] args) throws Exception {
    String a = "Hello world";
    String b = "Hello world";
    String c = new String("Hello world");

    System.out.println(a == b); // true
    System.out.println(a.equals(b)); // true
    
    System.out.println(a == c); // false
    System.out.println(a.equals(c)); // true
  }
}
