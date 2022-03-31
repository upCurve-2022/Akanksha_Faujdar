import java.util.*;
public class numberinwords {
   static void todigit(int n,String a[]) {
       if(n==0){
           return;
       }
        int num=n%10;
        n=n/10;
        todigit(n,a);
        System.out.print(a[num]+" ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        String[] a=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        todigit(n,a);
        }
    }

