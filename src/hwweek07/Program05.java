package hwweek07;
import java.util.Scanner;
public class Program05 {
    public static void main(String[] args) {
double empID,salary;
String name;
Scanner obj=new Scanner(System.in);////Scanner object creation
        System.out.println("Enter employee name: ");
        name=obj.nextLine();//user input
        System.out.println("Enter employee ID  : ");
        empID=obj.nextInt();//user input
        System.out.println("Enter employee basic salary : ");
        salary=obj.nextDouble();//user input

        System.out.println("_______________________________");
        System.out.println("|           Salary Slip         |");
        System.out.println("|_______________________________|");
        System.out.println("|Employee ID   :  "+empID+"           |");
        System.out.println("|Employee Name :  "+name+"           |");
        System.out.println("|_______________________________|");
        System.out.println("|Basic Salary  :  "+salary+"         |");
        System.out.println("|HRA 10%       :  "+((10*salary)/100)+"          |");//HRA calaculation: 10% of salary
        System.out.println("|TA   8%       :  "+((8*salary)/100)+"          |");//TA calaculation: 08% of salary
        System.out.println("|DA   9%       :  "+((9*salary)/100)+"          |");//DA calaculation: 09% of salary
        System.out.println("|PF -20%&      :  "+((20*salary)/100)+"          |");//PF calaculation: 20% of salary
        System.out.println("|_______________________________|");
        System.out.println("|Gross Salary  :  "+(salary+(((10*salary)/100))+(((8*salary)/100))+(((9*salary)/100))-(((20*salary)/100)))+"         |");
        System.out.println("|===============================|");



    }
}
