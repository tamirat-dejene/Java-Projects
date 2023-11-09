import java.util.Scanner;
public class Count_primes {
    static int number_of_primes(int start, int end) {
        if (start <= 1)
            start = 2;
        int count = 0;
        for (int i = start; i <= end; ++i) {
            boolean is_prime = true;
            for (int j = 2; j <= (int) Math.sqrt(i); ++j) {
                if (i % j == 0)
                    is_prime = false;
            }
            if (is_prime)
                ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound: "); int lb = sc.nextInt();
        System.out.print("Enter upper bound: "); int ub = sc.nextInt();
        sc.close();

        System.out.println("The number of primes between " + lb + " and " + ub + " is " + number_of_primes(lb, ub));
    }
}
