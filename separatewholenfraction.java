import java.util.*;
public class separatewholenfraction {
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        double n=sc.nextDouble();
            int a= n>0 ?(int)Math.floor(n):(int)Math.ceil(n);
         double b=n - a;
        System.out.println(Math.abs(a)+" "+Math.abs((int)(100*b)));
    }
}
