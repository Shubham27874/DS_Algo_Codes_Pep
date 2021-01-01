import java.util.*;

public class Wave_traversal{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    
    for(int j=0; j<arr[0].length; j++){
        if(j%2==0){   //In even columns, the wave will be in downwards direction,so for that 'i' will have a forward(simple) loop for rows.
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i][j]+" ");
            }
        } else{       //In odd columns, the wave will be in upwards direction,so for that 'i' will have a reverse loop for rows.
            for(int i=arr.length-1; i>=0; i--){
                System.out.println(arr[i][j]+" ");
                
            }
            
        }
    }
    
    
    sc.close();
}

}