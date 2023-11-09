public class Centered_array {
    public static boolean is_centered(int[] a) {
        if (a.length % 2 == 0)
            return false;
        int middle_index = (int) (a.length / 2);
        int i, j;
        for (i = j = middle_index; i > 0 && j < a.length - 1; --i, ++j) {
            if (a[j + 1] <= a[middle_index] || a[i - 1] <= a[middle_index])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[][] test_cases = { { 1, 2, 3, 4, 5 }, { 3, 2, 1, 4, 5 }, { 3, 2, 1, 4, 1 }, { 1, 2, 3, 4 }, {}, { 10 } };
        for (int i = 0; i < test_cases.length; ++i)
            System.out.println(is_centered(test_cases[i]));
    }
}
