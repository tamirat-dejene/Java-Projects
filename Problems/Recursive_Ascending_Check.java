public class Recursive_Ascending_Check {
    public static boolean ascending(int[] nums, int begin, int next) {
        if (nums[begin] > nums[next])
            return false;
        if (next < nums.length - 1) {
            begin = next;
            next += 1;
        }
        if (next == nums.length - 1)
            return true;
        ascending(nums, begin, next);
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1 };

        if (ascending(nums, 0, 1))
            System.out.println("The numbers are in ascending order.");
        else
            System.out.println("The numbers are not in ascending order.");
    }

}
