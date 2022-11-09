//n ta elementdan iborat massiv va k son berilgan. 
//K sondan eng yaqin massiv elementini chiqarish
import java.util.Scanner;
public class array60{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printf("n: "); int n = input.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = (int) Math.round(Math.random()*10);
        }
        for(int i=0;i<n;i++){
            int max1=0;
            for(int j=i;j<n;j++){
                if(A[i]==A[j])
                    ++max1;
            }
            if(max1==1)
                printf(A[i]+" ");
        }
        printf("\n");
        for(int i=0;i<n;i++){
            printf(A[i]+" ");
        }
        
     
    }
    public static void printf(String param){
        System.out.print(param);
    }
    public static void printf(int param){
        System.out.print(param+" ");
    }
}

