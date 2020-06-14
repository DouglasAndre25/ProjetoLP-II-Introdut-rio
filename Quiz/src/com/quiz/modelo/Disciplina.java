package com.quiz.modelo;

public class Disciplina extends Comum {

	private String nome;
	private double horasDuracao;

	public Disciplina() {
		super();
	}

	public void lerDados() {
		System.out.println("Digite o nome da disciplina: ");
		while(!this.setNome(sc.nextLine()));
		
		System.out.println("Duracao em horas dessa disciplina: ");
		while(!this.setHorasDuracao(sc.nextDouble()));
	}
	
	public void escrever() {
		System.out.println("--------------------------------");
		System.out.println("Nome da disciplina:" + this.nome);
		System.out.println("Duracao: " + this.horasDuracao + "h");
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

	public double getHorasDuracao() {
		return horasDuracao;
	}

	public boolean setHorasDuracao(double horasDuracao) {
		if(horasDuracao < 0) {
			this.dadoInvalido();
			return false;
		}
		
		this.horasDuracao = horasDuracao;
		return true;
	}

}
