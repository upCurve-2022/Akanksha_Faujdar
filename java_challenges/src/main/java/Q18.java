import java.util.*;
public class Q18 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max=(a>b && a>c)?a:(b>a && b>c)?b :c;
        System.out.println("The Largest Number is :"+ max);
    }
}
