
import java.util.Arrays;

public class copyofArr{
    public static void main(String[] args) {
        int[] arr = {30,40,50,60};

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
       
        // int[] nums = arr; // shallow copy
        // for(int ele : nums){ // for each loop in java
        //     System.out.print(ele+" ");

        // }
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 70;
        System.out.println(arr[0]);

    }
}