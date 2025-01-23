import java.util.Scanner;
public class level1Q8 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the countdown start value");
    int count = sc.nextInt();
    
    while(count>=0){
        System.out.print(count);
        count-- ;
    }
    sc.close();
    
    }
}
