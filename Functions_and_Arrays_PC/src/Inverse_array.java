import java.io.*;

public class Inverse_array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "");
    }
    System.out.println(sb);
  }
  // Ek defined type si input array milegi, toh usmai agar For eg: ith index pe 'j' value padi hai toh, resultant array(inv[]) 
  //                                                               mai jth index pe 'i' value hogi
  public static int[] inverse(int[] a){
    int[] inv = new int[a.length];
    
    for(int i=0; i<a.length; i++){
        int val = a[i];
        inv[val] = i;
    }
    
    return inv;
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}