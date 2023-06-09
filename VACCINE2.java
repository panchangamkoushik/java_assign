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
		while(t-->0){
		    int n = sc.nextInt();
		    int d = sc.nextInt();
		    int arr[] = new int[n];
		    int risk = 0;
		    int non_risk = 0;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]<=9 || arr[i]>=80) risk++;
		        else non_risk++;
		    }
		    
		    int rdays = risk/d;
		    if(risk%d != 0) rdays++;
		    int nr_days = non_risk/d;
		    if(non_risk%d != 0) nr_days++;
		    
		    System.out.println(rdays+nr_days);
		    
		}
	}
}