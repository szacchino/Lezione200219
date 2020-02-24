package it.adm.calcolomedia;

public class Esame {
	private String nome;
	private Integer voto;

	public String getNome() {
		return nome;
	}

	public Integer getVoto() {
		return voto;
	}

	public void setVoto(Integer voto) {
		this.voto = voto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Esame(String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}
	
}
