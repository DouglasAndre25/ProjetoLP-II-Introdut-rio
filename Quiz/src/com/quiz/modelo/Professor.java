package com.quiz.modelo;

import java.util.Vector;

public class Professor extends Funcionario {

	private Vector<Quiz> quizzes = new Vector<Quiz>();
	private Vector<Disciplina> disciplinas = new Vector<Disciplina>();
	
	public Professor() {
		super("Professor");
	}
	
	public void lerDados() {
		boolean temDisciplina = true;
		System.out.println("Insira uma Disciplina para o professor " + this.getNome());
		while(temDisciplina) {
			Disciplina disciplina = new Disciplina();
			disciplina.lerDados();
			disciplinas.add(disciplina);
			System.out.println("Inserir outra disciplina para o professor " + this.getNome() + "? (y/n)");
			String resposta = sc.next();
			temDisciplina = resposta.toUpperCase().equals("Y");
		}
		
		boolean temQuiz = true;
		System.out.println("Insira um quiz");
		while(temQuiz) {
			Quiz quiz = new Quiz();
			quiz.lerDados();
			quizzes.add(quiz);
			System.out.println("Inserir outro quiz para o professor " + this.getNome() + "? (y/n)");
			String resposta = sc.next();
			temQuiz = resposta.toUpperCase().equals("Y");
			
		}
	}
	
	public void escrever() {
		System.out.println("--------------------------------");
		System.out.println("Nome: " + super.getNome());
		System.out.println("Idade: " + super.getIdade());
		
		for(Disciplina item : this.disciplinas) {
			item.escrever();
		}
		
		for(Quiz item : this.quizzes) {
			item.escrever();
		}
	}

	public Vector<Quiz> getQuizzes() {
		return quizzes;
	}

}
