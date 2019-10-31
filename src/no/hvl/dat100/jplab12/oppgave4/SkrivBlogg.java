package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
	
	
		
		PrintWriter skriver;
		
		try {
		
			skriver = new PrintWriter(filnavn);
		} catch (FileNotFoundException e) {
		
			return false;
		}
		
		
		String tekst = samling.toString();
		
		skriver.println(tekst);
			
					
		skriver.close();
		return true;
		


	}
}
