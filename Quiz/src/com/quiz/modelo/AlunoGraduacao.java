package com.quiz.modelo;

public class AlunoGraduacao extends Aluno {

	private String graduacao;

	public AlunoGraduacao() {
		super();
	}
	
	@Override
	public void lerDados() {
		super.lerDados();
		System.out.println("Digite a graduacao que o aluno esta fazendo: ");
		while(!this.setGraduacao(sc.nextLine()));
	}
	
	@Override
	public void escrever() {
		super.escrever();
		System.out.println("Graduacao: " + this.graduacao);
	}

	public String getGraduacao() {
		return graduacao;
	}

	public boolean setGraduacao(String graduacao) {
		if(graduacao.equals("")) {
			this.dadoInvalido();
			return false;
		}
		this.graduacao = graduacao;
		return true;
	}
}
