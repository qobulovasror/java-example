// uchta son berilgan. sonlar orasida nechta son musbat ekanligini aniqlang 
import java.util.Scanner;
public class if23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A: "); int A = in.nextInt();
        System.out.print("B: "); int B = in.nextInt();
        System.out.print("C: "); int C = in.nextInt();
        int s=0;
        if(A>0)
            s++;
        if(B>0)
            s++;    
        if(C>0)
            s++;
        

        System.out.print("Javob: " + s );

    }
}
