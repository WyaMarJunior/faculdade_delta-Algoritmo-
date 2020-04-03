import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {      
       
      int A;
      int B;
      
      Scanner sc = new Scanner(System.in);    
      
      System.out.println("Digite o primeiro número a ser somado: ");
      A = sc.nextInt();
      
      System.out.println("Digite o segundo número a ser somado: ");
      B = sc.nextInt();
      
      int z = A + B;
      
      System.out.println("X = " + z );
    }
}
