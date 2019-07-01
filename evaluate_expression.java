
import java.util.*;


public class evaluate_expression {
	
public static void evaluatePostfix(String in){
		
        Map<Character,Integer> m=new HashMap<>();
        m.put('/',2);
        m.put('*',2);
        m.put('+',1);
        m.put('-',1);
        int n=in.length();
        Stack<Character> s=new Stack<Character>(); 
        String ans="";
        for(int i=0;i<n;i++)
        {
            char temp=in.charAt(i);
            if(Character.isDigit(temp))
            {
                ans=ans+temp;
            }
            else
            {
                if(s.isEmpty()||temp=='(')
                {
                    s.push(temp);
                }
                else
                {
                    if(temp==')')
                    {
                        while(s.peek()!='(')
                        {
                            ans=ans+s.pop();
                        }
                        s.pop();
                    }
                    else
                    {
						
                        if(m.containsKey(s.peek())&&m.containsKey(temp)&&m.get(s.peek())>=m.get(temp))
                        {
                            ans=ans+s.pop();
                            s.push(temp);
                        }
                        else
                        {
                            s.push(temp);
                        }
                    }
                }
            }
        }
        while(s.size()!=0)
        {
            ans=ans+s.pop();
        }
        Stack<Integer>s2=new Stack<>();
        System.out.println(ans);
        for(int i=0;i<ans.length();i++)
        {
            char temp=ans.charAt(i);
            if(Character.isDigit(temp))
            {
                s2.push(Character.getNumericValue(temp));
               // System.out.println(s2.peek());
            }
            else
            {
                //System.out.println(s2.peek()+"fn");
                int a=(s2.peek());
                //System.out.println(a+" defsdfv");
                s2.pop();
                int b=(s2.pop());
                //System.out.println(temp+" "+a+" "+b);
                if(temp=='/')
                {
                    s2.push(b/a);
                }
                if(temp=='-')
                {
                    s2.push(b-a);
                }
                if(temp=='*')
                {
                    s2.push(b*a);
                }
                if(temp=='+')
                {
                    s2.push(b+a);
                }
            }
        }
        System.out.println(s2.peek());

	}
	public static void main(String args[])
	{
		
		
		evaluatePostfix("((2+8)/5)");
		
	}

	

}
