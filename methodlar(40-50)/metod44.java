// berilgan natural sonni raqamlar sonini topiuvchi funcsiya tuzing
import java.util.Scanner;
public class metod44 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int a = in.nextInt();
        
        System.out.println(myFunction(a));
    }
    public static int myFunction(int a){
        int s=0;
        while(a>0){
            a=a/10;
            s++;
        }
        return s;
    }
}