import java.util.*;

public class Sum_of_two_arrays {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for( int i=0; i<a1.length; i++)
        {
            a1[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for( int i=0; i<a2.length; i++)
        {
            a2[i]=sc.nextInt();
        }
        
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c=0;
        
        int i = n1-1;
        int j = n2-1;
        int k = sum.length-1;
        
        
        while(k>=0){
            int d = c;
            
            if(i>=0){
                d += a1[i];
            }
            if(j>=0){
                d += a2[j];
            }
            
            c = d/10;
            d = d%10;
            
            sum[k] = d;
            
            i--;
            j--;
            k--;
            
        }
            if(c>0){
                	
            } 
            
            for(int val: sum){
                System.out.println(val);
            }
        
            sc.close();
    }

}