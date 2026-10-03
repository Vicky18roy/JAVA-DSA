import java.util.Arrays;
public class builtinMethods {
    public static void main(String[] args) {
        int[] arr = {45,36,12,67,89,78};

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){

                System.out.print(arr[i]+" ");
        }
        }
    }

