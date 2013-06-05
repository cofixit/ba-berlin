
public class Natuerlich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		diagonal(52204);
		
	}
	
	static int z(int m, int n) {
		int z = ( (n+m-1) * (n+m-2) / 2) + m;
		return z;
	}
	
	/**
	 * Gibt zu einer Zaehlvariable nach dem Diagonalverfahren die passenden Koordinaten in der Diagonaltabelle an. 
	 * @param i Zaehlvariable, zu der ein Zahlenpaar generiert werden soll
	 * @return Das Zahlenpaar (Array mit zwei Feldern)
	 */
	static int[] diagonal(int i) {
		int[] result = new int[2];
		// result[0] = m, result[1] = n
		
		// Zunaechst wird ermittelt, in welcher Diagonale wir sind. 
		// Die Diagonale nimmt mit jeder Reihe an Menge an Zahlenpaaren zu. 
		// Die Einordnung der Indizes zu den Diagonalenreihen verhalten sich so: 
		//  1 |  2  |   3   |     5    |        6
		// ---+-----+-------+----------+---------------
		//  1 | 2 3 | 4 5 6 | 7 8 9 10 | 11 12 13 14 15  
		int diagonale = (int) Math.ceil(0.5 + Math.sqrt(0.25 + 2 * i));
		
		// Haben wir die Diagonalenreihe ermittelt, koennen wir aber das groesste Zahlenpaar ermitteln. 
		int max = (diagonale-1) * ((diagonale-1) + 1) / 2;
		
		// Wir kennen die Zahlenfolge an der Stelle des Maximums: 
		/*
		 * +-----+-----+-----+-----+-----+
		 * |     |  1  |  2  |  3  |  4  |
		 * +-----+-----+-----+-----+-----+
		 * |  1  | 1;1 | 1;2 | 1;3 | 1;4 |
		 * +-----+-----+-----+-----+-----+
		 * |  2  | 2;1 | 2;2 | 2;3 |     |
		 * +-----+-----+-----+-----+-----+
		 * |  3  | 3;1 | 3;2 |     |     |
		 * +-----+-----+-----+-----+-----+
		 * |  4  | 4;1 |     |     |     |
		 * +-----+-----+-----+-----+-----+
		 * 
		 * Das Zahlenpaar ist immer 1;<Diagonalenreihe>.
		 * 
		 * Jetzt koennen wir die Differenz zwischen der gesuchten Nummer und der groessten Zahl ermitteln. 
		 * Auf diese Differenz schlagen wir die vorhandene 1 drauf und haben damit die linke Zahl des Paars bestimmt. 
		 * 
		 * Die rechte Zahl laesst sich aus der Differenz der Diagonale und der linken Zahl des Paares bestimmen. 
		 *  
		 */
		result[1] = 1 + (max - i);
		result[0] = diagonale - result[1];
		
		System.out.println("m: " + result[0] + "; n: " + result[1] + "; z:" + z(result[0], result[1]));
		
		return result;
	}
}
