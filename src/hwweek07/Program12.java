package hwweek07;
import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);//scanner object

        System.out.println("Enter a value character: ");
        char x =obj.next().charAt(0);//it will consider first letter of input
        if ((x>='a'&&x<='z')||(x>='A'&&x<='Z')){
            System.out.println(x+" is a Alphabet");
        }else if(x>='0'&&x<='9'){
            System.out.println(x+ " is a Number");
        }else{
            System.out.println(x+ " is a Symbol");
        }
    }
}
