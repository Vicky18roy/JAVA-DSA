public class twosum {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,6};
        int x = 8;

    for(int i =0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i] + arr[j] == x){
                System.out.println(i+" "+j);
            }
        }
    }
    }
}
