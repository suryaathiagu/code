import java.util.*;
import java.lang.*;

class large
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--)
        {
             System.out.print(a[i]);
        }
    }   
}
