
import java.util.*;

public class String_compression {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));

        sc.close();
    }
    
    public static String compression1(String str) {
        String s = str.charAt(0) + "";

        for (int i = 1; i < str.length(); i++) {

            char c = str.charAt(i);
            char p = str.charAt(i - 1);
            if (c != p) {
                s += c;
            }
        }
    return s;

    }

    public static String compression2(String str) {
         String s = str.charAt(0) + "";
         int count=1;

        for (int i = 1; i < str.length(); i++) {

            char c = str.charAt(i);
            char p = str.charAt(i - 1);
            if (c == p) {
                count++;
            } else { 
            if(count>1) {
                s += count;
                count = 1;
            } 
            s += c;
        }
    }
        
            if(count>1){
                s += count;
                count = 1;
            
            }
        return s;
    }
}