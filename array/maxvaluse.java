public class maxvaluse {
    public static void main(String[] args) {
        int[] arr = {10,34,25,67,34};
        int max = Integer.MIN_VALUE; // valuse will become 0 

        for(int i=1;i<arr.length;i++){
            // compare the arr[i]=10 to min valuse like 0 if these are compare they are become max = 10
            if(arr[i] > max){ 
                // after comparing the we will put data of arr[i] to max for compare to loop
                max = arr[i]; 
            }
        }
        System.out.println(max);
    }
        
           
        }


