import java.util.*;
public class removealloccurenceofacharater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
       // String s="geeksforgeeks";
        System.out.println("enter the character ");
        char k=sc.next().charAt(0);
        char y[]=s.toCharArray();
        int n=y.length;
       // char k='g';
        int i=0;
        String res=" ";
        while(i!=n){
            if(y[i]!=k){
                res=res+y[i];
            }
            ++i;
        }
        System.out.println("Required string is: ");
        System.out.print(res);
    }

}
