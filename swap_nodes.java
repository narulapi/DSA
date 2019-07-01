/*class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}*/
	
  	
	
	
	
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
        
        if(i==j)
        {
            return head;
        }
        if(i>j)
        {
            int temp=i;
            i=j;
            j=temp;
        }
        if(j-i==1)
        {
            if(i==0)
            {
              LinkedListNode<Integer> temp =head;
                LinkedListNode<Integer> temp2 =head.next.next;
              head=head.next;
                head.next=temp;
                temp.next=temp2;
                return head;
            }
          LinkedListNode<Integer> temp =null;  
          LinkedListNode<Integer> tempi =head;
          for(int i1=1;i1<=i;i1++)
          {
              temp=tempi;
              tempi=tempi.next;
          }
            LinkedListNode<Integer> tempj=tempi.next;
            temp.next=tempj;
            tempi.next=tempj.next;
            tempj.next=tempi;
            return head;
            
        }
        LinkedListNode<Integer> temp1=null;
        LinkedListNode<Integer> temp2=head;
        LinkedListNode<Integer> temp3=head.next;
        
        LinkedListNode<Integer> temp21=null;
        LinkedListNode<Integer> temp22=head;
        LinkedListNode<Integer> temp23=head.next;
        
        for(int i1=1;i1<=j;i1++)
        {
            if(i1<=i)
            {
                temp1=temp2;
                temp2=temp2.next;
                temp3=temp3.next;
            }
            
                temp21=temp22;
                temp22=temp22.next;
                temp23=temp23.next;
        }
        if(temp1==null)
        {
            if(temp23==null)
            {
                temp21.next=head;
                head.next=null;
                head=temp22;
                temp22.next=temp3;
            }
            else
            {
                temp21.next=temp2;
                temp2.next=temp23;
                head=temp22;
                temp22=temp3;
            }
        }
        else
        {
             if(temp23==null)
            {
                temp1.next=temp22;
                 temp22.next=temp3;
                 temp21.next=temp2;
                 temp2.next=null;
            }
            else
            {
                temp1.next=temp22;
                temp22.next=temp3;
                temp21.next=temp2;
                temp2.next=temp23;
            }
            
        }
         
		return head;
	}
