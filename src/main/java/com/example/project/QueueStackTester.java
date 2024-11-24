package com.example.project;
public class QueueStackTester
{
	static int count =1;
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
    	if(q.length()==0)
    		return;
    	
    		if(count%2==0) {
    			eq.enqueue(q.serve());
    			count++;
    			}
    		else {
    			oq.enqueue(q.serve());
    			count++; }
			split(q, oq, eq);

    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
    	LinkedPQ <T>qq = new LinkedPQ<T>();
    	
    	PQElement e;
    	for(int i=0;i<pq.size;i++) {
    		 e=pq.serve();
    		if(e.p>=p)
    			qq.enqueue((T) e.data, e.p);
    	}
    	for(int i=0;i<qq.size;i++) {
    		e=qq.serve();
    		pq.enqueue((T) e.data, e.p);
    	}
    		
    		
    	
    
    	
       
    }
    public static <T> boolean search(Stack<T> st, T e)
    {       
        if(st.empty())
        	return false;
      T top=st.pop();
      if(top.equals(e)) {
    	  st.push(top);
    	  return true;
      }
      boolean f=search(st,e);
      st.push(top);
      return f;
    	  
        
    }
}
