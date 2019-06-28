import java.util.*;
import java.lang.*;

class print
{  
    public static void main(String args[])
    {
       TreeSet<Integer> t=new TreeSet<>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					t.add(a[i]);
				}
			}
		}
			 Iterator<Integer> itr=t.iterator();  
  while(itr.hasNext()){  
   System.out.print(itr.next()+" ");  
  }  
		s.close();
    }
}