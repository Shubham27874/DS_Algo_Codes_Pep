
import java.util.*;

public class Bar_chart {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++)
        {
            arr[i]=scn.nextInt();
        }
        
        //Finding maximum value
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        
        
        for(int f=max; f>=1; f--)             //y-axis
        {
            for(int i=0; i<arr.length; i++)   //x-axis
            { 
                if(arr[i]>=f)
                	{ 
                		System.out.print("*	");
                	}
                else
                	{
                		System.out.print("	");
                	}
            }
            System.out.println();
        }
        
        scn.close();
    }

}