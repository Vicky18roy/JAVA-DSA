

public class strr {
    public static void main(String[] args) {
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4;j++){
        //         System.out.print((char)(j+96)+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=4;i++){
            for(char j='a';j<='d';j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 
        for(char i='A';i<='E';i++){

            for(int j=i;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
