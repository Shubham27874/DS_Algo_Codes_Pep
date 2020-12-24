
import java.util.*;

public class Span_of_array{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr = new int[n];
    
    for(int i=0; i<arr.length; i++){
    arr[i] = sc.nextInt();
    }
    // Will use the champion strategy -> Assume one element of the array as champion(max or min)
    //                                  traverse the array and compare and update the max and min value from the array.
    //								    Max - Min = Span of the array
    int max = arr[0];  // Here, arr[0] i.e. the first element is champion.
    int min = arr[0];
    for(int i = 1; i<arr.length; i++)
    {
        if(arr[i]>max)
        {
        max=arr[i];
        }
        else if(arr[i]<min)
        {
        min=arr[i];
            
        }
    }
    int val = max - min;
    System.out.println(val);
    
    sc.close();
 }

}

