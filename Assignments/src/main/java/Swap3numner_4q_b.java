import java.util.*;
public class Swap3numner_4q_b {
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        System.out.println("Numbers before swapping are : "+"a= "+a+" b= "+b+" c= "+c);
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("Numbers after swapping are : "+"a= "+a+" b= "+b+" c= "+c);
    }
}
