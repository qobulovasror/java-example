//n ta elementdan iborat massiv va k son berilgan. 
//K sondan eng yaqin massiv elementini chiqarish
import java.util.Scanner;
public class array57{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printf("n: "); int n = input.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = (int) Math.round(Math.random()*10);
        }
        printf("k: "); int k = input.nextInt();
        int min[] = new int[n];
        for(int i=0;i<n;i++){
            min[i] = Math.abs(A[i]-k);
        }
        int min1=min[0], minPoint=0;
        for(int i=0;i<n;i++){
            if(min1>min[i]){
                min1=min[i];
                minPoint=i;
            }
        }
        
        printf(A[minPoint]);

    }
    public static void printf(String param){
        System.out.print(param);
    }
    public static void printf(int param){
        System.out.print(param+" ");
    }
}