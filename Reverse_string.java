import java.util.Scanner;
public class Reverse_string {
    public static String reverse(String str) {
        int length = str.length();
        char[] chars = new char[length];
        for (int i = 0; i < length; ++i) {
            chars[i] = str.charAt(length - i - 1);
        }
        return new String(chars);
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to be reversed: ");
        String inputStr = scanner.nextLine();
        
        if (!inputStr.equalsIgnoreCase("")){
            System.out.println("\nReversed string is : " + reverse(inputStr));
        } else {
            System.out.println("\nPlease enter valid string!");
        }
        
        scanner.close();
    }
    
}
