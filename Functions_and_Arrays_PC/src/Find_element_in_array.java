import java.util.*;

public class Find_element_in_array{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    
    //inputs
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    int data = sc.nextInt();
    
    //work
    int idx = -1;
    for(int i=0; i<arr.length; i++)
    {
    if(arr[i]==data)
    {
        idx = i;                          // data milte hi uska index update karden.
    }
    }
    System.out.println(idx);
    
    sc.close();
    }

}