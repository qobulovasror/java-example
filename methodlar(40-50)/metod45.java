// berilgan natural sonni raqamlar yig'indisini topiuvchi funksiya tuzing
import java.util.Scanner;
public class metod45 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int a = in.nextInt();
        
        System.out.println(myFunction(a));
    }
    public static int myFunction(int a){
        int s=0;
        while(a>0){
            s+=a%10;
            a=a/10;
        }
        return s;
    }
}