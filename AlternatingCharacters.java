import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class AlternatingCharacters{

	static String removeCharAt(String s, int pos) {
		  return s.substring(0, pos) + s.substring(pos + 1);
	}
	
	
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no_of_testcase=s.nextInt();
		String values="";
		int removechars;
		
		ArrayList<String> arrlist = new ArrayList<String>(no_of_testcase);
		for(int i=0;i<no_of_testcase;i++)
		{
			values=s.next();
			arrlist.add(values);
		}
		
		for(int i=0;i<arrlist.size();i++)
		{
			removechars=0;
			for(int k=0;k<arrlist.get(i).length()-1;k++)
			{
				if(arrlist.get(i).charAt(k)==arrlist.get(i).charAt(k+1))
				{
					removeCharAt(arrlist.get(i),k+1);
					removechars++;
				}
			}
			System.out.println(removechars);
		}
		
	}
}