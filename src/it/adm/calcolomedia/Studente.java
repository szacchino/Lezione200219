package it.adm.calcolomedia;

import java.util.HashMap;
import java.util.Map;

public class Studente {

	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		// this.esami = new Esame[28];
		this.esami = new HashMap<Esame, Integer>();
	}

	public Map<Esame, Integer> getEsami() {
		return esami;
	}

	public void addEsameSostenuto(Esame esame, Integer voto) {
		this.esami.put(esame, voto);
	}

	private String nome;

	private String cognome;

	// Esame esami[];
	private Map<Esame, Integer> esami;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getMedia() {
		double somma = 0;
		for (Integer voto: esami.values()) {
			somma += voto;
		}
		if (esami.size() > 0) {
			return somma / esami.size();
		} else return 0;
	}

	public double getMediaStream() {
		return esami.size()==0?0:(double)esami.values().stream().reduce(0,(somma, addendo) ->  somma + addendo)/esami.size();
	}
	
	public double getSomma() {
		return (double)esami.values().stream().reduce(0,(somma, addendo) ->  somma + addendo);
	}


}
