package hwweek07;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Scanner object creation

        System.out.print("Enter the year: ");
        int year = in.nextInt();//user will enter year
        //Set the limit of Gregorian calender
        if (year > 1582) {
            boolean a = (year % 4) == 0;//first condition
            boolean b = (year % 100) != 0;//Second condition
            boolean c = ((year % 100 == 0) && (year % 400 == 0));//third condition

            if (a && (b || c)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else
            System.out.println(" Year must be greater than 1582-the first year of Gregorian calender");
    }
}
