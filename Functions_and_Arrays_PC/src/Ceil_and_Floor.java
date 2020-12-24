import java.util.*;

public class Ceil_and_Floor{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
        //inputs
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int data = sc.nextInt();
    
    //Finding ceil and floor using BINARY SEARCH
    int l = 0;
    int h = a.length-1;
    int ceil = 0;
    int floor = 0;
    
    while(l<=h){ //just a true condition. l kabhi h se jyada nhi hona chahiye means usse cross na karjaye. thats what we made sure from these conditon.
        int m = (l + h) / 2;  //mid value index
        
        if(data<a[m]){   // left side
            h = m-1;
            ceil = a[m];
        } else if(data>a[m]){
            l = m+1;
            floor = a[m];
        }else {  //data is found successfully.
            ceil = a[m];
            floor = a[m];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
    
    
    sc.close();
 }

}