import java.util.*;

public class SI_q3 {
    public  static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        int p=sc.nextInt();
        System.out.println("Enter Rate");
        int r=sc.nextInt();
        System.out.println("Enter Time");
        int t=sc.nextInt();
        int s;
        s=(p*r*t)/100;
        System.out.println("Simple Interest is : "+s);

    }
}
