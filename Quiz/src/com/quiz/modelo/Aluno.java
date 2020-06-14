package com.quiz.modelo;

public class Aluno extends Comum {

	private String nome;
	private int idade;
	
	public Aluno() {
		super();
	}

	public void lerDados() {
		System.out.println("Digite o nome do aluno: ");
		while(!this.setNome(sc.nextLine()));
		
		System.out.println("Digite sua idade: ");
		while(!this.setIdade(sc.nextInt()));
	}
	
	public void escrever() {
		System.out.println("--------------------------------");
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Idade: " + this.idade);
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

	public int getIdade() {
		return idade;
	}

	public boolean setIdade(int idade) {
		if(idade < 0) {
			this.dadoInvalido();
			return false;
		}
		
		this.idade = idade;
		return true;
	}
	
}
