package hwweek07;

import java.util.Scanner;
import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];
        String[] words=new String[5];
        System.out.println("Please enter array numbers(length of array:5) : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();//user input
        }
        ;
        Program17 xyz = new Program17();//object calling
        xyz.number1(numbers);//method calling via object
        System.out.println("Please enter array Strings(length of array:5) : ");
        for (int i = 0; i < numbers.length; i++){
            words[i] = input.next();//user input
        }
        xyz.word1(words);

    }
    //method for numeric array
    public void number1(double number[]) {
        System.out.println("Original Array: " + Arrays.toString(number));//array list
        Arrays.sort(number);
        System.out.println("Sorted Array:" + Arrays.toString(number));//array list once sorted
    }
    //method for string array
    public void word1(String word[]) {
        System.out.println("Original Array: " + Arrays.toString(word));
        Arrays.sort(word);
        System.out.println("Sorted Array:" + Arrays.toString(word));
    }

}
