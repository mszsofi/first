package ikermajdnemprimek;

import java.io.*;
import java.util.*;

public class prim {
	public static void main (String[] args) {
	    Scanner a =new Scanner(System.in);
	    int n=a.nextInt();
	    ArrayList<Integer> v=new ArrayList<>();
	    //Vector<Integer> v = new Vector<>();
	    int r=0;
	    v.add(0);
	    v.add(2);
	    for(int i=3;i<=n-1;i++)
	    {
	    	r=0;
	    	for(int j=2;j<=i-1;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			r++;
	    		}
	    	}
	    	if(r==0)
	    	{
	    		v.add(i);
	    	}
	    }
	    
	    /*for(int i=1;i<=v.size()-1;i++)
	    {
	    	System.out.println(v.get(i));
	    }*/
	    
	    int sz1=0;
	    int sz2=0;
	    for(int i=2;i<=n;i++)
	    {
	    	sz1=0;
	    	sz2=0;
	    	for(int j=1;j<=v.size()-1;j++)
	    	{
	    		for(int k=j;k<=v.size()-1;k++)
	    		{
	    			if(i==(v.get(j)*v.get(k)))
	    			{
	    				sz1++;
	    			}
	    			if((i-1)==(v.get(j)*v.get(k)))
	    			{
	    				sz2++;
	    			}
	    		}
	    		
	    	}
	    	if(sz1==1 && sz2==1)
	    	{
	    		System.out.print(i);
	    		System.out.print(" ");
	    		System.out.print(i-1);
	    		System.out.println();
	    	}
	    }
	    
	    
	    
	    
	    
	    
	    
	    /*for(int i=2;i<=n;i++)
	    {
	    	int sz1=0;
	    	int sz2=0;
	    	for(int j=1;j<=v.size()-1;j++)
	    	{
	    		if((i%(v.get(j))==0) && (i!=(v.get(j))))
	    		{
	    			for(int k=1;k<=v.size()-1;k++)
	    			{
	    				if(v.get(k)==(i/(v.get(j))))
						{
	    					sz1++;
						}
	    			}
	    		}
	    		if(((i-1)%v.get(j)==0) && ((i-1)!=v.get(j)))
	    		{
	    			for(int k=1;k<=v.size()-1;k++)
	    			{
	    				if(v.get(k)==((i-1)/(v.get(j))))
						{
	    					sz2++;
						}
	    			}
	    		}
	    		System.out.println(sz1);
	    		System.out.println(sz2);
	    		System.out.println();
	    	}
	    	if((sz1==2) && (sz2==2))
    		{
    			System.out.print(i);
    			System.out.print(" ");
    			System.out.print(i-1);
    			System.out.println();
    		}
	    }*/
	}
}

