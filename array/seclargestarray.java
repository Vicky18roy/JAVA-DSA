public class seclargestarray {
    public static void main(String[] args) {
        int[] arr = {5,9,3,12,7};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];

            }
            else if(arr[i] > smax){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
