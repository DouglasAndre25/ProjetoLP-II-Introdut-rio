package com.quiz.modelo;

public class Curso extends Comum {
	
	private String nome;
	private String tipo;
	
	public Curso(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	public void lerDados() {
		System.out.println("Digite o nome do curso: ");
		while(!this.setNome(sc.nextLine()));
	}
	
	public void escrever() {
		System.out.println("--------------------------------");
		System.out.println("Nome do curso: " + this.nome);
		System.out.println("Tipo do curso: " + this.tipo);
	}

	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
		if(nome.equals("")) {
			this.dadoInvalido();
			return false;
		}
		this.nome = nome;
		return true;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean setTipo(String tipo) {
		if(tipo.equals("")) {
			this.dadoInvalido();
			return false;
		}
		this.tipo = tipo;
		return true;
	}
	
}
