public class countneagative {
    public static void main(String[] args) {
        
        int[] arr = {1,3,-3,-4,-6};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                count++;
                 
            }

        
        }
        System.out.print(count+" ");
         
    }
}
