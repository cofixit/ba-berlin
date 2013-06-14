import java.util.Stack;


public class Ackermann {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ackermannLoop(2,3));
		System.out.println(ackermannRec(2,3));
	}
	
	public static int ackermannLoop(int m, int n){
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
	
	public static int ackermannRec(int m, int n) {
		if (m == 0) return n + 1;
		else if (n == 0) return ackermannRec(m-1, 1);
		else {
			return ackermannRec(m-1, ackermannRec(m, n-1));
		}
	}

}
