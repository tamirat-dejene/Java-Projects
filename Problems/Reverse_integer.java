public class Reverse_integer {
    public static int f(int n) {
        int temp = Math.abs(n);
        int count_digit = 0;
        while (temp > 0) {
            temp /= 10;
            ++count_digit;
        }
        temp = Math.abs(n);
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10 * Math.pow(10, count_digit - 1);
            temp /= 10;
            --count_digit;
        }
        if (n < 0)
            return -1 * sum;
        return sum;
    }
    
    public static void main(String[] args) {
        int[] test_cases = { 1234, 12005, 1, 1000, 0, -12345 };
        for(int i = 0; i<test_cases.length;++i)
            System.out.println(f(test_cases[i]));
    }
}
