package com.gmail.leonkellerhals.regularexpressions;

public class Beispiel2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String text = "If you optimize everything, \nyou will always be unhappy." +
				"\n\n- Donald Knuth";
		System.out.println(text);
		String pattern = "(\n)+";
		
		String[] lines = text.split(pattern);
		
		for (int i = 0; i < lines.length; i++) {
			System.out.println((i+1) + ". Zeile: " + lines[i]);
		}
		
	}

}
