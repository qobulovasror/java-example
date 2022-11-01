// berilgan n soni fibunachi son ekanligini aniqlang
import java.util.Scanner;
public class while40 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        boolean b=false;
        int k=1,i=1,l=0;
        while(k<=n){
            l=k+i;
            k=i;
            i=l;
            if(i==n){
                b=true;
            }
        } 
        if(b!=true){
            b=false;
        }
        System.out.println(b);
    }
}//2 
// 1 1 2 3 5 8 13 21

