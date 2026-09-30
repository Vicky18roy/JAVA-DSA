
import java.util.Scanner;
public class outputandinput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    //   int[] arr = new int[7];
    //   //input
    //   for(int i=0;i<=6;i++){
    //     arr[i] = sc.nextInt();

    //   }
    //   //output
    //   for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    //   }

        //input another
    System.out.print("enter size of array");
        int n = sc.nextInt();
        int[]  arr = new int[n];

        // input
        for (int i = 0; i<=n-1; i++) {
                arr[i] = sc.nextInt();
        }
        // output -> loop
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
         


    }
    
}