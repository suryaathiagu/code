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
        //System.out.print(a[0]);
        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i]);
            if(a[i]==a[i+1])
            {
                int b=a[i];
                System.out.print(b);
                break;
            }
        }
    }
}
