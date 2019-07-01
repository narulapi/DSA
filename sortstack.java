import java.util.*;
class sortstack
{
  public static void sortStack(Stack<Integer> s1){
		
		// Write your code here		
        Stack<Integer> s2=new Stack<Integer>();
        while(!s1.isEmpty())
        {
            if(s2.size()==0)
            {
                int a=s1.pop();
                s2.push(a);
            }
            else
            {
                int a=s1.pop();
                if(a<=s2.peek())
                {
                    s2.push(a);
                }
                else
                {
                    while(s2.size()!=0&&a>s2.peek())
                    {
                        int temp=s2.pop();
                        s1.push(temp);
                    }
                    s2.push(a);
                }
            }
        }
        while(!s2.isEmpty())
        {
            System.out.println(s2.pop());
        }

	}
}
