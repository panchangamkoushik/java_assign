import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int e=sc.nextInt();
		    if(((a+b)<=d) && c<=e)
		    System.out.println("yes");
		    else if(((a+c)<=d) && b<=e)
		    System.out.println("yes");
		    else if(((b+c)<=d) && a<=e)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}
	}
}
