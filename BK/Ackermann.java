import java.util.Stack;


public class Ackermann {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ackermann(2,3));
	}
	
	public static int ackermann(int m, int n){
	    Stack<Integer> s = new Stack<Integer>();
	    s.add(m);
	    while(!s.isEmpty()){
	        m=s.pop();
	        if(m==0||n==0)
	            n+=m+1;
	        else{
	            s.add(--m);
	            s.add(++m);
	            n--;
	        }
	    }
	    return n;
	}

}
