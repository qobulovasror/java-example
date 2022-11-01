// Berilgan yilda nechta ku borligini aniqlang
import java.util.Scanner;
public class if29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("YIl: "); int A = in.nextInt();
        if(A%4==0){
            if(A%100==0){
                if(A%400==0){
                    System.out.println("Javob: " + 366);
                }else{

                    System.out.println("Javob: " + 365);
                }
            }else{
                System.out.println("Javob: " + 365);
            }
        }else{
            System.out.println("Javob: " + 365);

        }
    }
}