import java.util.*;

public class Print_Subsets {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        
        int limit = (int)Math.pow(2, a.length);
        
        for(int i=0; i<limit; i++){ //(2^length) tak chalega, mtlb input ke utne subsets available hai.
            String set = "";
            int temp = i;  // imp
            
            //convert i to binary and use 0's and 1's to print the element or not.
            for(int j=a.length-1; j>=0; j--){  //ulta rakhna jaruri hai, kyunki jab value fetch hoti hai toh ulti hoti hai
                int r= temp%2; // i ko nhi pareshan karna yaha because he's already controlling the outer loop, 
                               //if i ki value yaha change hui toh bahar effect padhta.
                temp = temp/2;
                
                if(r==0){
                    set = "-	"+set;
                }else{
                    set=a[j]+"	"+set;
                }
                
            }
        
            System.out.println(set);
        }
        
        sc.close();
    }

}