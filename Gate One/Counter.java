import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
       
        
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            
System.out.print("Do you want to enter another number? (yes/no): ");
            String choice = scanner.next();
            
        } while(choice.equals("yes"));
        
        System.out.println("Positive numbers entered: " + 	positiveCount);
        System.out.println("Negative numbers entered: " + 	negativeCount);
        System.out.println("Zeros entered: " + zeroCount);
        
       
    }
}