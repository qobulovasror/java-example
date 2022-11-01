// n soni berilgan. dastlabki n ta juft sonlardan tashkil topgan massiv yarating
import java.util.Scanner;
public class array52 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n: "); int n = in.nextInt();
        int A[] = new int [n];
        int l=2;
        for(int i=0;i<A.length;i++){
            A[i] = l;
            l+=2;
        }
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }

    }
}