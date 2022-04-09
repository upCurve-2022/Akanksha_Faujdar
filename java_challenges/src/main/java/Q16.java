import java.util.*;
public class Q16 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int c;
        char y[]=str.toCharArray();
        System.out.println("Dupicate characters are: ");
        for(int i=0;i<y.length;i++){
            c=1;
            for(int j=i+1;j<y.length;j++){
                if(y[i]==y[j] && y[i]!=' ') {
                    c++;
                    y[j] = '0';
                }
            }
            if(c>1 && y[i]!='0'){
            System.out.println(y[i]);}
        }

    }
}
