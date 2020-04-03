import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
       
       
      int x;
      int y;
      
      Scanner sc = new Scanner(System.in);
      
      
      System.out.println("Digite o primeiro número a ser multiplicado: ");
      x = sc.nextInt();
      
      System.out.println("Digite o segundo número a ser multiplicado: ");
      y = sc.nextInt();
      
      int z = x * y;
      
      System.out.println("PROD = " + z );
    }
}


