import java.util.*;

public class FirstIndex_and_LastIndex{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
    
    int data = sc.nextInt();
    
    //calculating the first index of the given data
    int l = 0;
    int h = a.length-1;
    int fi = -1;  //fi = first index
    //Using BINARY SERACH
    while(l<=h){
        int m = (l + h)/2;
        
        if(data<a[m]){
            h = m - 1;
        }else if(data>a[m]){
            l = m+1;
        } else{  //data found
            fi = m;
            h=m-1; //is used usually to break out from as this thing will not hold true acc. to condition of the loop, 
            	   //and also if there is any other potential answer(to check that).
        }
    }
    
    System.out.println(fi);
    
    
    l = 0;
    h = a.length-1;
    int li = -1; //Li = last Index
    
    while(l<=h){
        int m = (l + h)/2;
        
        if(data<a[m]){
            h = m - 1;
        }else if(data>a[m]){
            l = m+1;
        } else{
            li = m;
            l = m+1;
        }
    }
    
    System.out.println(li);
    
    
    sc.close();
 }

}