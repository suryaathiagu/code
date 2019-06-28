import java.util.Scanner;

public class samp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		//List<Integer> al=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==i)
			{
				if(i!=a.length-1)
				System.out.print(i+" ");
				else
					System.out.print(i);
			}
			else
			{
				System.out.print("-1");
			}
		}

	}
}
