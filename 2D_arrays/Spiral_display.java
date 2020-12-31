import java.util.*;

public class Spiral_display {

    public static void main(String[] args) throws Exception {
    Scanner sc =new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int[][] a = new int[n][m];
    for(int i=0; i<a.length; i++){
        for(int j=0; j<a[0].length;j++){
            a[i][j] = sc.nextInt();
        }
    }
    
    int minr = 0;
    int minc = 0;
    int maxr = a.length-1;
    int maxc = a[0].length-1;
    int c = 0;
    int tne = n*m;  //total no. of elements
    
    while(c < tne){
        
        //left wall
        for(int i=minr,j=minc; i<=maxr && c < tne; i++){
            System.out.println(a[i][j]);
            c++;
        }
        minc++;
        
        //bottom wall
        for(int i=maxr,j=minc; j<=maxc && c < tne; j++){
            System.out.println(a[i][j]);
            c++;
        }
        maxr--;
        
        //right wall
        for(int i=maxr, j=maxc; i>=minr && c < tne; i--){
            System.out.println(a[i][j]);
            c++;
        }
        maxc--;
        
        //top wall
        for(int i=minr,j=maxc; j>=minc && c < tne; j--){
            System.out.println(a[i][j]);
            c++;
            }
        minr++;
        
        
    }
    
    
    sc.close();
    }

}