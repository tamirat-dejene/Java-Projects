public class Sum_Factor_of_array {
    public static int sumFactor(int[] a) {
        if (a.length == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < a.length; ++i)
            sum += a[i];
        int count = 0;
        for (int i = 0; i < a.length; ++i)
            count = (a[i] == sum) ? count + 1 : count;
        return count;
    }
    
    public static void main(String[] args) {
        int[] a = { 9, -3, -3, -1, -1 };
        System.out.println(sumFactor(a));
    }
}
