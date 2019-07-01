public class solution {

    public static void print(int p,int tot,int arr[][],int sti,int stj,int eni,int enj)
    {
        if(p==tot||sti>eni||stj>enj)
        {
            return;
        }
        for(int j=stj;j<=enj;j++)
        {
            System.out.print(arr[sti][j]+" ");
            p++;
        }
        if(p==tot)
        {
            return;
        }
        for(int i=sti+1;i<=eni;i++)
        {
            System.out.print(arr[i][enj]+" ");
            p++;
        }
        if(p==tot)
        {
            return;
        }
        for(int j=enj-1;j>=stj;j--)
        {
            System.out.print(arr[eni][j]+" ");
        }
        if(p==tot)
        {
            return;
        }
        for(int i=eni-1;i>sti;i--)
        {
            System.out.print(arr[i][stj]+" ");
            p++;
        }
        if(p==tot)
        {
            return;
        }
        print(p,tot,arr,sti+1,stj+1,eni-1,enj-1);
        
    }
        
	public static void spiralPrint(int arr[][]){
		// Write your code here
        int n=arr.length;
        int m=arr[0].length;
        int ch=n*m;
        print(0,ch,arr,0,0,n-1,m-1);

	}
}
