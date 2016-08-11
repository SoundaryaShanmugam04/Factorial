public class Factorial{
  static int num = 7;

  public static void main(String[] args) {
    int fact = num;
    for (int i = (num - 1); i > 1; i--) {
      fact = fact * i;
    }
    System.out.println("fact of num is" + fact);
  }
}
