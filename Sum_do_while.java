import java.util.Scanner;
public class Sum_do_while {
    public static void main(String[] args) {
        int upper_bound;
        System.out.print("Enter the upper bound for the sum: ");
        Scanner sc = new Scanner(System.in);
        upper_bound = sc.nextInt();
        sc.close();
        
        int x = 1, sum = 0;
        do {
            sum += x;
            ++x;
        } while (x <= upper_bound);
        System.out.println("Sum of numbers from 1 to " + upper_bound + " is: " + sum);
    }
}
