package it.adm.calcolomedia;

public class TestEsame2 {
	public static void main(String[] args) {
		Studente studente = new Studente("Mario", "Rossi");
		// studente.setEsami(new Esame[28]);
		

		Esame analisi1 = new Esame();
		analisi1.setNome("Analisi Matematica I");
		
		Esame geometria = new Esame();
		geometria.setNome("Geometria");
		Esame inf1 = new Esame();
		inf1.setNome("Fondamenti di informatica I");
		Esame chimica = new Esame();
		chimica.setNome("Chimica");
		Esame fisica1 = new Esame();
		fisica1.setNome("Fisica I");
		
		Esame analisi2 = new Esame();
		analisi2.setNome("Analisi Matematica II");
		Esame inf2 = new Esame();
		inf2.setNome("Fondamenti di informatica II");
		Esame calcolo = new Esame();
		calcolo.setNome("Calcolo Numerico");
		Esame fisica2 = new Esame();
		fisica2.setNome("Fisica II");
		Esame economia = new Esame();
		economia.setNome("Economia ed organizzazione aziendale");
		
		
		studente.addEsameSostenuto(analisi1, 27);
		studente.addEsameSostenuto(fisica1, 28);
		studente.addEsameSostenuto(chimica, 26);
		studente.addEsameSostenuto(geometria, 29);
		studente.addEsameSostenuto(inf1, 30);
		studente.addEsameSostenuto(analisi2, 26);
		studente.addEsameSostenuto(fisica2, 27);
		studente.addEsameSostenuto(calcolo, 29);
		studente.addEsameSostenuto(inf2, 30);
		studente.addEsameSostenuto(economia, 24);

		System.out.println(studente.getMediaStream());
		System.out.println(studente.getSomma());

		// esame.setVoto(30);
		// studente.getEsami()[0] = esame;
		
		// System.out.println(studente.getEsami()[0].getVoto());
	}
}
