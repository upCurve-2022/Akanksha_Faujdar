public class demonstratewaystocomparetwostrings {
    public static void main(String args[]){
        String str1="Akanksha";
        String str2="Faujdar";
        String str3="AKANKSHA";
        String str4="Akanksha";
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1==str2);

    }
}
