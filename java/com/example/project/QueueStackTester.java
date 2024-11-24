package com.example.project;
public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    	q.
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    	LinkedPQ <T>qq = null;
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