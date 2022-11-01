//1 kg konfet narxi berilgan (haqiqiy son). 1, 2 ... 10 kg konfet narxlarini chiqarish kerak
import java.util.Scanner;
public class for34 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("K: "); float k = in.nextFloat();
        for(int i=2; i<=10; i+=2){
            System.out.println(i*k);
        }
    }
}
