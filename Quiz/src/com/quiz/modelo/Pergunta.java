package com.quiz.modelo;

public abstract class Pergunta extends Comum {
	
	private String descricao;
	private String tipo;
	private double pontos;

	public Pergunta(String tipo) {
		super();
		this.setTipo(tipo);
	}
	
	public void lerDados() {
		System.out.println("Digite a descricao da pergunta: ");
		while(!this.setDescricao(sc.nextLine()));
		System.out.println("Digite quantos pontos vale essa pergunta: ");
		while(!this.setPontos(sc.nextDouble()));
		sc.nextLine();
	}
	
	public void escrever() {
		System.out.println("--------------------------------");
		System.out.println("Tipo da pergunta: " + this.tipo);
		System.out.println("Pergunta: " + this.descricao);
		System.out.println("Vale " + this.pontos + " pontos");
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean setDescricao(String descricao) {
		if(descricao.equals("")) {
			this.dadoInvalido();
			return false;
		} else {
			this.descricao = descricao;
			return true;			
		}
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPontos() {
		return pontos;
	}

	public boolean setPontos(double pontos) {
		if(pontos < 0) {
			this.dadoInvalido();
			return false;
		} else {
			this.pontos = pontos;
			return true;			
		}
	}
}
