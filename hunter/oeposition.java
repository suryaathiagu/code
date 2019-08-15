import java.util.*;
import java.lang.*;

class oeposition
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
        for(int j=0;j<n;j++)
        {
            if(j%2==1)
            {
            if(a[j]%2==0)
                System.out.print(a[j]);
            }   
            else if(j%2==0)
            {
                if(a[j]%2==1)
                System.out.print(a[j]);
            }
        }
    }
}
