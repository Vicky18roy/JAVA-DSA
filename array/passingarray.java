public class passingarray {
    public static void main(String[] args) {
       int[] arr = {3,5,3,5,6};
       System.out.println(arr[0]);
       change(arr);
       System.out.println(arr[0]);
    }
    public static void change(int[] arr) {
        arr[0] = 90;
    }
}
