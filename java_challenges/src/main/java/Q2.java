import java.util.*;
public class Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and heightbof the cylinder");
        int r=sc.nextInt();
        int h=sc.nextInt();
        double v;
        v=3.14*r*r*h;
        System.out.println("Voume is : "+v);
    }
}
