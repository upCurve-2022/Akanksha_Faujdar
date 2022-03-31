import java.util.*;
public class largestnseclargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
                int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            if(b>c)
            {
                System.out.println("Largest is: "+a);
                System.out.println("Second Largest is :"+b);
            }
            else{
                System.out.println("Largest is: "+a);
                System.out.println("Second Largest is :"+c);
            }
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.println("Largest is: "+b);
                System.out.println("Second Largest is :"+a);
            }
            else{
                System.out.println("Largest is: "+b);
                System.out.println("Second Largest is :"+c);
            }
        }
        else{
            if(a>b){
                System.out.println("Largest is: "+c);
                System.out.println("Second Largest is :"+a);
            }
            else{
                System.out.println("Largest is: "+c);
                System.out.println("Second Largest is :"+b);
            }
        }
    }
}
