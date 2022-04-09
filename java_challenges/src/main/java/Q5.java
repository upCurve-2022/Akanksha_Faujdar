import java.util.*;
public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        perfectsq(n);
        if(perfectsq(n)){
            System.out.println("Yes");
        }
        else{
        System.out.println("No");}
    }
    static boolean perfectsq(int n){
        if(n>=0){
            int r=(int)Math.sqrt(n);
            return ((r*r)==n);
        }
        return false;}
}
