
public class Rekursionen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Rekursionen().add(5, 6);
	}
	
	public int add(int x, int y) {
		if (y == 0) {
			return x;
		}
		++y;
		
		return add(x, y) + 1;
	}

}
