public class PrintDayInWord {
    public static void nested_if_else_printDay(int day_in_number) {
        if (day_in_number == 0)
            System.out.println("Sunday");
        else if (day_in_number == 1)
            System.out.println("Monday");
        else if (day_in_number == 2)
            System.out.println("Tuesday");
        else if (day_in_number == 3)
            System.out.println("Wednesday");
        else if (day_in_number == 4)
            System.out.println("Thursday");
        else if (day_in_number == 5)
            System.out.println("Friday");
        else if (day_in_number == 6)
            System.out.println("Saturday");
        else
            System.out.println("Not a valid day.");
    }

    public static void switch_case_printDay(int day_in_number) {
        switch (day_in_number) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day.");
        }
    }

    public static void main(String[] args) {
        int[] test_case = { 0, 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < 8; ++i)
            nested_if_else_printDay(test_case[i]);
        for (int i = 0; i < 8; ++i)
            switch_case_printDay(test_case[i]);
    }
}