package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {

	// TODO - deklarering av objektvariable

	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;

		// Laget første konstruktør med 3 argument

		// TODO
		// throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		// Laget andre konstruktør med 4 argument

		// TODO - START

		// throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public String getBruker() {

		return bruker;

		// returnerer bruker

		// throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;

		// setter bruker variabel

		// throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		// throw new UnsupportedOperationException(TODO.method());
		return dato;
// returnerer dato
	}

	public void setDato(String dato) {
		// throw new UnsupportedOperationException(TODO.method());
		this.dato = dato;
		// setter dato
	}

	public int getId() {
		// throw new UnsupportedOperationException(TODO.method());
		return id;
// returnerer id

	}

	public int getLikes() {
		// throw new UnsupportedOperationException(TODO.method());
		return likes;

// returnerer likes
	}

	public void doLike() {
		this.likes = this.likes+1;
		// inkrementerer likes med 1
		// throw new UnsupportedOperationException(TODO.method());
	}

	public boolean erLik(Innlegg innlegg) {
		return id == innlegg.id;
	}

	@Override
	public String toString() {
		
		// "1\nOle Olsen\n23-10-2019\n7\n"
		
		String returid = id+ "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return returid;
		
		
		
		
		

		// throw new UnsupportedOperationException(TODO.method());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
