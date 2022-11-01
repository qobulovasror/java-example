//k va n raqamlari berilgan k ni n marta chiqarish kk
import java.util.Scanner;
public class for33 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("K: "); int k = in.nextInt();
        System.out.print("N: "); int n = in.nextInt();
        for(int i=0; i<k; i++){
            System.out.println(n);
        }
    }
}
