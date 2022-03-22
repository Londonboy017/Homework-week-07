package hwweek07;

import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);//Scanner object creation
        System.out.println("Please enter a number:");//Please enter a number:
        a = obj.nextInt();//read number by user
        if (a % 2 == 0) {  //logic for find out even
            System.out.println("Number is even");
        } else { //if logic not fulfilled
            System.out.println("Number is odd");
        }

    }
}
