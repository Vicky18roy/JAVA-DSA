import java.util.ArrayList;


public class basicsofArraylist {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> num = new ArrayList<>(6);{

        num.add(0,10);
        num.add(1,45);
        num.add(2,20);
       // System.out.println(num);

       num.set(2, 60);
       System.out.println(num);
       num.remove(2);

       System.out.println(num);

      num.add(90);
       
       System.out.println(num.size());



    }
}


}
