import java.util.*;
public class immutablestring {
    public static void reference(Object a,Object b){
        if(a==b){
            System.out.println("Reference of both the strings are same");
        }
        else{
            System.out.println("Reference of both the strings are different");
        }
    }
    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings: ");
        String s1= sc.nextLine();
        String s2=sc.nextLine();*/
        String s1="java";
        String s2="java";
        System.out.println("Before modification strings are");
        reference(s1,s2);
        s1+="ava";
        System.out.println("After modification strings are");
        reference(s1,s2);
    }

}
