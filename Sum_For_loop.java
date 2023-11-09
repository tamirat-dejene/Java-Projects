import java.util.Scanner;
public class Sum_For_loop {
    public static void main(String[] args) {
        int ub, sum = 0;
        System.out.print("Enter the upper sum bound: ");
        Scanner sc = new Scanner(System.in);
            ub = sc.nextInt();
        sc.close();
        
        for (int i = 1; i <= ub; ++i)
            sum += i;
        
        System.out.println("1 + 2 + 3 + ... + " + ub + " = " + sum);
    }
}
