package com.gmail.leonkellerhals.regularexpressions;

import java.util.regex.*;

public class Einfuehrung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p = Pattern.compile("Glaub mir!");
		Matcher m = p.matcher("Dies ist ein Text. Glaub mir!");
		boolean b = m.matches();
			
		System.out.println(b);
		
		String pattern = "[abfor]+";
		String text = "foobar";
		b = text.matches(pattern);
		
		System.out.println(b);
	}

}