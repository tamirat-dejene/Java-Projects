import java.util.Scanner;

public class Multiple_of_five {
    public int the_number;
    public boolean is_multiple_of_five() {
        boolean yn = (the_number % 5 == 0) ? true : false;
        return yn;
    }

    public void set_the_number() {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        the_number = sc.nextInt();
        sc.close();
    }

    public static void main(String[] args) {
        Multiple_of_five number = new Multiple_of_five();
        number.set_the_number();
        if(number.is_multiple_of_five())
            System.out.println(number.the_number + " is multiple of 5.");
        else
            System.out.println(number.the_number + " is not multiple of 5.");
    }
}
