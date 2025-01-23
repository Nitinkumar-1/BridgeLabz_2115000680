 import java.util.Scanner;
     public class level1Q9 {
      public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the countdown start value");
       int count = sc.nextInt();
        for(int i=count; i>=1; i--){
        System.out.println(i);
        }
    System.out.println("launch");
    sc.close();
    }
}
