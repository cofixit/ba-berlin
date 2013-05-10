package com.gmail.leonkellerhals.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Beispiel1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String text = "Die Geschwindigkeit, mit der wir uns durch die Zeit " +
				"bewegen - oder sich die Zeit durch uns bewegt? - " +
				"oder die Zeit die Welt bewegt? - ist konstant. ";
		//									  mehr oder weniger Albert Einstein
		System.out.println(text);
		
		Pattern p = Pattern.compile("-");
		Matcher m = p.matcher(text);
		
		// Anzahl der Matches zählen
		int i = 0;
		while(m.find()) i++;
		System.out.println("Die RegEx wurde " + i + " Mal gefunden.\n");
		
		String replacedAll = m.replaceAll("GEDANKENSTRICH");
		System.out.println(replacedAll);
		
	}

}
