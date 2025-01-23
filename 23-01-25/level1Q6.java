import java.util.Scanner;
public class level1Q6 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number");
            int num = sc.nextInt();
            if (num>0) {
                System.out.println("The number is " + num + " positive ");
            } else if (num<0) {
                System.out.println("The number is " + num + " negative");
            } else {
                System.out.println("The number is " + num + " zero");
            }
            sc.close();
        }
}
