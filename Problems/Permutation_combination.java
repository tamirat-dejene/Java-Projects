import java.util.Scanner;
public class Permutation_combination {
    public static int permutation(int m, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return m;
        return m * permutation(m - 1, n - 1);
    }
    
    public static int combination(int m, int n) {
        if( n == 0 || n == m)
            return 1;
        return combination(m - 1, n - 1) + combination(m - 1, n);
    }

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of permutations  and combinations calculator! p(m, n)");
        System.out.println("Enter m and n such that,  m >= n and both are non negatives.");

        System.out.print("m : "); m = sc.nextInt();
        System.out.print("n : "); n = sc.nextInt();        
        sc.close();

        System.out.println("p(" + m + ", " + n + ") = " + permutation(m, n));
        System.out.println("c(" + m + ", " + n + ") = " + combination(m, n));


        

    }
}
