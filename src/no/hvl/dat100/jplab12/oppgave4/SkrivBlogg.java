package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
	
		String skrivtilfil = filnavn;
		String skriverier = samling.toString();
		PrintWriter skriver;
		try {
		
			skriver = new PrintWriter(skrivtilfil);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			return false;
		}
		for(int i = 0; i<samling.getAntall(); i++) {
			
		
			
			
		} 			skriver.println(skriverier);
		skriver.close();
		return true;
		
		
		


	}
}
