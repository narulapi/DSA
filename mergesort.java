public class mergesort {

    public static void sort(int inp[],int s,int e)
    {
        int n=e-s+1;
        if(s>=e)
        {
            return;
        }
        int mid=(s+e)/2;
        sort(inp,s,mid);
		
		//System.out.println("");
        sort(inp,mid+1,e);
		
        int arr[]=new int[n];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=e)
        {
			//System.out.println("hi1");
            if(inp[i]<inp[j])
            {
                arr[k]=inp[i];
                i++;
                k++;
            }
			else
			{
				arr[k]=inp[j];
				j++;
				k++;
			}
        }
        while(i<=mid)
        {
			//System.out.println("hi2");
            arr[k]=inp[i];
            k++;
            i++;
        }
        while(j<=e)
        {
			//System.out.println("hi3");
            arr[k]=inp[j];
            k++;
            j++;
        }
        int h=s;
        for(int i1=0;i1<n;i1++)
        {
            inp[h]=arr[i1];
            //s++;
            h++;
        }
        
    }
	public static void mergeSort(int[] inp){
		// Write your code here
        int n=inp.length;
		sort(inp,0,n-1);
	}
	
}
