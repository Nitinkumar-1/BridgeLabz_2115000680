import java.util.Scanner;
public class level1Q7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month(1 for january, 2 for february, etc.): ");
        int month = sc.nextInt();
        System.out.print("Enter the day");
        int day = sc.nextInt();
           boolean isSpring = false;
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) || 
            (month == 5 && day >= 1 && day <= 31) || 
            (month == 6 && day >= 1 && day <= 20)) { 
            isSpring = true;
          } 
          if(isSpring) {
              System.out.println("It's a Spring Season");
          } else {
              System.out.println("It's not a Spring Season");
          }
          
          
        sc.close ();
        
    }
    }
