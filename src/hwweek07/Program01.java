package hwweek07;

import java.util.Scanner;
import java.util.SortedMap;

public class Program01 {
    public static void main(String[] args) {
        int a;
        String c;

        Scanner obj = new Scanner(System.in);//Scanner object creation
        System.out.println("Please enter a number:");//Please enter a number:
        a = obj.nextInt();//read number by user

        c = a % 2 == 0 ? "'Even number'" : "'Odd number'";//logic for odd,even
        System.out.println("Enter number is " + c);
    }


}

