//https://www.hackerrank.com/challenges/caesar-cipher-1
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        int k = in.nextInt();
        
        char[] myCharArray=str.toCharArray();
		int ascii_rep=0;
		
		for(int i=0;i<myCharArray.length;i++)
		{
			int counter=1;
			ascii_rep=(int)myCharArray[i];
			if(ascii_rep>=(int)'A'&& ascii_rep<='Z'||ascii_rep>=(int)'a'&& ascii_rep<='z')
			{
				while(counter<=k)
				{
					if(ascii_rep==(char)'z')
					{
						counter++;
						ascii_rep=(int)'a';
					}
					else if(ascii_rep==(char)'Z')
					{
					    counter++;
						ascii_rep=(int)'A';
					}
					else
                    {
						counter++;
						ascii_rep++;
					}
				}
				myCharArray[i]=(char)ascii_rep;
		  }//end if
       }
       System.out.println(new String(myCharArray));
    }
}
