//import java.util.Scanner;
public class negative {
    public static void main(String[] args) {
      
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter array size:");
        // int n = sc.nextInt(); 

        // System.out.print("enter elements");
        // int[] arr= new int[n];
      
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();

        // }

        // //print negative vlaues
        // for(int i=0;i<n;i++){
        //    if(arr[i] < 0){
        //     System.out.print(arr[i]+" ");
        //    }
        // }

        int[] arr = {1,-2,3,-4};

        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                System.out.println(arr[i]+" ");
            }
        }

    }
}
