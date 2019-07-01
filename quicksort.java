
public class quicksort {
    
	public static void fun(int inp[],int s,int e)
    {
        if(s>=e)
        {
            return;
        }
        int t=s;
        for(int i=s;i<e;i++)
        {
            if(inp[i]<=inp[e])
            {
                t++;
            }
        }
        int p=inp[e];
        int temp=inp[t];
        inp[t]=inp[e];
        inp[e]=temp;
        int i=s;
        int j=e;
		//System.out.println(t+" t");
        while(i<t&&j>t)
        {
			//System.out.println(i);
			//System.out.print("hi");
            for(;i<t;)
            {
				//System.out.println(i+" i");
                if(inp[i]>p)
                {
                    break;
                }
                else
                {
                    i++;
                }
            }
            for(;j>t;)
            {
				//System.out.println(j+" j");
                if(inp[j]<=p)
                {
                    break;
                }
                else
                {
                    j--;
                }
            }
			//System.out.println(i+" if"+j+" "+t);
            if(i<t&&j>t)
            {
				//System.out.println(" if");
                int temp2=inp[i];
                inp[i]=inp[j];
                inp[j]=temp2;
                i++;
                j--;
            }
            
        }
     
        fun(inp,s,t-1);
        fun(inp,t+1,e);
        
    }
	public static void quickSort(int[] inp) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        int n=inp.length;
        fun(inp,0,n-1);
		
	}


	
}
