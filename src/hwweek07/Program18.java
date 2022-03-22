package hwweek07;

import java.util.*;
//import java.util.Arrays;

public class Program18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double sum=0;
        double num[] = new double[4];//declare array and fix its length by 4
        System.out.println("Please enter array numbers(length of array: ) : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = obj.nextInt();//user input
        }
        System.out.println("Original Array: " + Arrays.toString(num));//array list
        for (int i = 0; i < num.length; i++) {
          sum   =sum+num[i];
        }
        //sum = num[1] + num[2] + num[3] + num[0];//sum of array numbers
        System.out.println("Sum of array numbers : " + sum);

    }
}
