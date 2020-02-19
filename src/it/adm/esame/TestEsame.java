package it.adm.esame;

public class TestEsame {

	public static int media;
	
	public static void main(String[] args) {
		Esame esame1 = new Esame();
		esame1.nome = "Calcolo Numerico";
		esame1.voto = 24;
		Esame.qualsiasi = 14;

		Esame esame2 = new Esame();
		esame2.voto = 25;
		System.out.println(esame1.qualsiasi);
		System.out.println(esame2.qualsiasi);
		System.out.println(esame1.voto);
		System.out.println(esame2.voto);
		
	}

}
