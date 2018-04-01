
public class StackMain {
	
	 public static void main(String args[])
	    {
		 StackSort s = new StackSort(5);
	        s.push(1);
	        s.push(9);
	        s.push(2);
	        s.push(8);
	        s.push(4);
	        s.search(2);
	        
	        
	        StackS ss = new StackS(5);
	        while(!s.isEmpty())
	        {
	        	int tmp = s.pop();

	        	while(!ss.isEmpty() && ss.peek() > tmp)
	        	{
	        		s.push(ss.pop());
	        	}
	        	ss.push(tmp);
	        }
	        
	        System.out.println(ss.pop());
	        System.out.println(ss.pop());
	        System.out.println(ss.pop());
	        System.out.println(ss.pop());
	        System.out.println(ss.pop());
	       
	    }
}
	        
	        
	        	 

	        
	    
	 

