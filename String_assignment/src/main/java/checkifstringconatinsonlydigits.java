import java.util.*;
public class checkifstringconatinsonlydigits {
   public static boolean check(String s,int n){
        int i=0;
        for(i=0;i<n;i++){
            if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
                return  true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        int n=s.length();
        System.out.println(check(s,n));
    }
}
