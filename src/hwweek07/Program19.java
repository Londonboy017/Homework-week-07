package hwweek07;
import java.util.Scanner;
import java.util.Arrays;
public class Program19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double avg=0;
        double num[] = new double[5];//declare array and fix its length by 5
        System.out.println("Please enter array numbers(length of array: ) : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = obj.nextInt();//user input
        }
        System.out.println("Original Array: " + Arrays.toString(num));//array list
        for (int i = 0; i < num.length; i++){
            avg=(avg+num[i])/num.length;

        }
        //avg = (num[0] + num[1] + num[2] + num[3] + num[4]) / 5;//Average calculation
        System.out.println("Average value of array elements: "+avg);
    }
}
