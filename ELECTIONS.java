/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0){
		    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		    if (a>50)
		        System.out.println("A");
		    else if (b > 50)
		        System.out.println("B");
		    else if (c > 50)
		        System.out.println("C");
		  else
		    System.out.println("NOTA");
		}
	}
}
