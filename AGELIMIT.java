import java.util.*;
public class Main{
	public static boolean eligibleOrNot(int x, int y, int a)
	{
		if(a>=x && a<y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int a=sc.nextInt();

			if(eligibleOrNot(x,y,a))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			t=t-1;
		}
	}
}