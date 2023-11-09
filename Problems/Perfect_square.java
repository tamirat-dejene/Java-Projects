import java.util.Scanner;
public class Perfect_square {
    public static int next_perfect_square(int current) {
        if (current < 0)
            return 0;
        int n = (int) (Math.floor(Math.sqrt(current))) + 1;
        return ((int) Math.pow(n, 2));
    }
    
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int the_number = sc.nextInt();
        sc.close();
        System.out.println("The next perfect square: " + next_perfect_square(the_number));
    }
}
