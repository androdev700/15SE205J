package lab3_2;

public class Lab3_2 {
  public static void main(String[] args) {
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());
    int res = a|4+c>>b&7;
    System.out.println("a|4+c>>b&7 = " + res);
  }
}
