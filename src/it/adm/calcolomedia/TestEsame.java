package it.adm.calcolomedia;

public class TestEsame {
	public static void main(String[] args) {
		Studente studente = new Studente();
		studente.setNome("Mario");
		studente.setCognome("Rossi");
		studente.esami = new Esame[28];

		System.out.println(studente.esami[0].getVoto());
	}
}
