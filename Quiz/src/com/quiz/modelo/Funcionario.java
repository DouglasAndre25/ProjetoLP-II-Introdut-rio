package com.quiz.modelo;

public abstract class Funcionario extends Comum {

	private String nome;
	private int idade;
	private String cargo;
	
	public Funcionario(String cargo) {
		super();
		this.lerDados(cargo);
	}
	
	public void lerDados(String cargo) {
		this.cargo = cargo;
		System.out.println("Digite o nome do " + this.cargo + ": ");
		while(!this.setNome(sc.nextLine()));
		
		System.out.println("Digite a idade: ");
		while(!this.setIdade(sc.nextInt()));
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
