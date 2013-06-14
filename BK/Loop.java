
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Division:");
		System.out.println(div(32, 3));
		System.out.println(div(8, 1));
		System.out.println(div(7, 4));
		
		System.out.println("Modulo:");
		System.out.println(mod(8, 3));
		System.out.println(mod(8, 4));
		System.out.println(mod(32, 17));
		
		
	}
	
	public static int div(int n, int m) {
		int r = 0, x, k = n;
		
		for (int i = 1; i <= k; i++) {
			x = n-m+1;
			if (x > 0) r++;
			n = n-m;				
		}
		return r;
	}
	
	public static int mod(int n, int m) {
		int r = 0, x, k = n;
		
		for (int i = 1; i <= k; i++) {
			x = sub(n+1, m);
			if(x == 0) r = n;
			else n = sub(n, m);
		}
		
		return n;
	}
	
	public static int sub(int n, int m) {
		if (n-m >= 0) return n-m;
		return 0;
	}

}
