//n ta elementdan iborat massiv va k son berilgan. 
//K sondan eng yaqin massiv elementini chiqarish
import java.util.Scanner;
public class array58{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printf("n: "); int n = input.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = (int) Math.round(Math.random()*10);
        }
        int max = A[0]+A[1];
        int maxPoint = 0;
        for(int i=1;i<n-1;i++){
            if(max<A[i]+A[i+1]){
                max=A[i]+A[i+1];
                maxPoint = i;
            }
        }
        for(int i=0;i<n;i++){
            printf(A[i]+" ");
        }
        printf("\n"+A[maxPoint]+"+"+ A[maxPoint+1]);

    }
    public static void printf(String param){
        System.out.print(param);
    }
    public static void printf(int param){
        System.out.print(param+" ");
    }
}