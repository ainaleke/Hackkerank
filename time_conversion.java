//https://www.hackerrank.com/challenges/time-conversion
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int timeStringLength=time.length()-1;
        String[] timeSplit=time.split("[:\\'AM'\\'PM']");
        String convertedTime="";
        String checkAMPM=Character.toString(time.charAt(timeStringLength-1))+Character.toString(time.charAt(timeStringLength));
        int Hr=Integer.parseInt(timeSplit[0]);
        if(Hr<12 && checkAMPM.equals("PM")) 
        {
		  Hr=Hr+12;
          timeSplit[0]=Integer.toString(Hr);
        }
        else if(timeSplit[0].equals("12")&& checkAMPM.equals("AM"))
        {
            timeSplit[0]="00";    
        }
        else if(timeSplit[0].equals("12") && checkAMPM.equals("PM"))
        {
            //do nothing
        }
        for(int i=0;i<timeSplit.length;i++)
        {
            	if(i==0)
            	{
            		convertedTime=timeSplit[i];
            	}
            	else{
            		convertedTime=convertedTime+":"+timeSplit[i];
            	}
      
        } 
        System.out.println(convertedTime.toString());
    }
}
