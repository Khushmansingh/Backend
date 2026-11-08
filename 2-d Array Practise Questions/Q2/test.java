import java.util.ArrayList;
import java.util.Collections;

public class test {

    public ArrayList<Integer> kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr.add(matrix[i][j]);
            }
        }

        Collections.sort(arr);

        return arr;
        
    }

    public static void main(String[] args) {
        test obj = new test();

        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;

        System.out.println("The sorted array is: " + obj.kthSmallest(matrix, k));
    }
}
