import java.util.*;

public class Print_Subarrays{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    
    
    for(int i=0;i<arr.length;i++){               //travel karne mai madad karta hai
        for(int j=i; j<arr.length; j++){		 //travel karne mai madad karta hai
            for(int k=i; k<=j; k++){			 //Print karne mai help karega
                System.out.print(arr[k]+"	");
            }
            System.out.println(); //important
        }
    }
    
    sc.close();
 }

}