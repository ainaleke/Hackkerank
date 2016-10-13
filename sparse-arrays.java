//https://www.hackerrank.com/challenges/sparse-arrays

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        //take in first integer
        int n1=input.nextInt();
        //take in next few Strings
        String[] stringArray1=new String[n1];
        for(int i=0;i<n1;i++)
        {
            stringArray1[i]=input.next();
            
        }
        int n2=input.nextInt();
        String[] stringArray2=new String[n2];
        for(int j=0;j<n2;j++)
        {
            stringArray2[j]=input.next();
        }
        //now start comparing strings, loop thru each value in second array and compare with all values in first array
        for(int i=0;i<n2;i++)
        {
            int count=0;
            for(int k=0;k<n1;k++)
            {
                if(stringArray2[i].equals(stringArray1[k]))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
