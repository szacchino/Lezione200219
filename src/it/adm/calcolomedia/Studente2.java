package it.adm.calcolomedia;

public class Studente2 {
	private String nome;
	private String cognome;
    public Esame esami[];
    
    public Studente2(int numeroEsami) {
        this.esami = new Esame[numeroEsami];
    }

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
}
