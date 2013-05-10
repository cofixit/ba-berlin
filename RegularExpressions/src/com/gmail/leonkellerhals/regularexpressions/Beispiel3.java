package com.gmail.leonkellerhals.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Beispiel3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pattern casesensitivity = Pattern.compile("a*b", Pattern.CASE_INSENSITIVE);
		
		Matcher m1 = casesensitivity.matcher("aaaaAAAaAb");
		
		casesensitivity = Pattern.compile("a*b"); // keine Flags - CASE SENSITIVE
		Matcher m2 = casesensitivity.matcher("aaaaAAAaAb");
		
		System.out.println(m1.matches());
		System.out.println(m2.matches());
	}

}
