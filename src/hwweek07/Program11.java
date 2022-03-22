package hwweek07;

public class Program11 {
    public static void main(String[] args) {
        int num=100;
        System.out.println("List of numbers between 1 to 100 which can be devide by 3:");
        for(int i=1;i<=num;i++){ //set range 1-100
        if (i%3==0)//logic for number devisible by 3
        {
            System.out.println(i+" ");
        }
         }
        System.out.println("List of numbers between 1 to 100 which can be devide by 5:");
        for (int j=1;j<=num;j++){ //set range 1-100
            if(j%5==0){ //logic for number devisible by 5
                System.out.println(j+" ");
            }
        }
}}
