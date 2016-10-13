//https://www.hackerrank.com/challenges/diagonal-difference
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int sumOfLeftDiagonal=0;
        int sumOfRightDiagonal=0;
        //leftDiagonal
        for(int i=0;i<n;i++){
            sumOfLeftDiagonal+=a[i][i];
        }
        //rightDiagonal
        for(int j=0;j<n;j++){
            sumOfRightDiagonal+=a[j][n-1-j];
        }
        int sum=Math.abs(sumOfLeftDiagonal-sumOfRightDiagonal);
        System.out.println(sum);
        
    }
}
