
public class wave_print {

	
	// input - input 2D array
	public static void wavePrint(int inp[][]){
		
		// Write your code here
        int n=inp.length;
        int m=inp[0].length;
        boolean s=true;
        int j=0;
        while(j<m)
        {
            if(s==true)
            {
                int i=0;
                while(i<n)
                {
                    System.out.print(inp[i][j]+" ");
                    i++;
                }
                s=false;
            }
            else
            {
                int i=n-1;
                
                while(i>=0)
                {
                    System.out.print(inp[i][j]+" ");
                    i--;
                }
                s=true;
                
            }
            j++;
        }

	}

	
}
