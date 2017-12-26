import java.io.*;
import java.util.*;

public class DiagonalDiff {

    //public static int 
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        
        for (int i=0; i < n; i++) {
        	for (int j=0; j < n; j++) {
        		matrix[i][j] = in.nextInt();
        	}
        }
        
        System.out.print(matrix);
    }
}