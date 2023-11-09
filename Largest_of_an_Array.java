import java.util.Scanner;
public class Largest_of_an_Array {
    public static int largest(int[] nums) {
        int largest = nums[0];
        for (int i = 0; i < nums.length; ++i)
            if (nums[i] >= largest)
                largest = nums[i];
        return largest;
    }
    
    public static void main(String[] args) {
        int[] nums; int s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        s = sc.nextInt();
        nums = new int[s];
        System.out.println("\nEnter " + s + " integers to store in an array");
        for(int i = 0;i<s;++i)
            nums[i] = sc.nextInt();
        sc.close();
        
        System.out.println("The largest from the list is: " + largest(nums));
    }
}
