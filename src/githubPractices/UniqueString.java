package githubPractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueString {
	public static void main (String[] agrs) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s = br.readLine();
        int l = s.length();
        char ch;
        String ans="";
         
        for(int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')
                ans = ans + ch;
            s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space
        }
 
       System.out.println("Word after removing duplicate characters : " + ans);
	}
}
