// berilgan n soni kubini topuvchi funksiya tuzing 
import java.util.Scanner;
public class metod41 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        
        System.out.println(daraja(n));
    }
    public static int daraja(int a){
        return (int) Math.pow(a,3);
    }
}