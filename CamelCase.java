//https://www.hackerrank.com/challenges/camelcase

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] letters=new int[256];
        int ascirep=0;
        int N=s.length();
        int i=0;
        int count=1;
        int capsA=(int)'A';
        int capsZ=(int)'Z';
        while(i<N){
            ascirep=(int)s.charAt(i);
            if(ascirep>=capsA && ascirep <=capsZ){
                count++;
            }
            i++;
        }
        
        System.out.println(count);
    }
}
