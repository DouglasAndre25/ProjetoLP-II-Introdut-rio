package com.quiz.modelo;

import java.util.Vector;

public class Turma extends Comum {

	private String nome;
	private Vector<AlunoGraduacao> alunoGraduacao = new Vector<AlunoGraduacao>();
	private Vector<AlunoPosGraduado> alunoPos = new Vector<AlunoPosGraduado>();
	
	public Turma() {
		super();
	}
	
	public void lerDados() {
		System.out.println("Digite o nome da turma: ");
		while(!this.setNome(sc.nextLine()));
		
		boolean temAluno = true;
		while(temAluno) {
			System.out.println("Insira o aluno");
			System.out.println("Esse aluno faz pos graduacao? (y/n)");
			boolean ehPos = sc.next().toLowerCase().equals("y");
			if(ehPos) {
				alunoPos.add(new AlunoPosGraduado());
			} else {
				alunoGraduacao.add(new AlunoGraduacao());
			}
			System.out.println("Inserir mais um aluno? (y/n)");
			temAluno = sc.next().toLowerCase().equals("y");
		}
	}
	
	public void escrever() {
		System.out.println("--------------------------------");
		System.out.println("Nome: " + this.nome);
		
		for(AlunoPosGraduado item : alunoPos) {
			item.escrever();
		}
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

}
