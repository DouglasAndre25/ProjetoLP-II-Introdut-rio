package com.quiz.controle;

import com.quiz.modelo.Professor;

public class CadastrarQuiz {

	private Professor professor = new Professor();
	
	public CadastrarQuiz() {
		professor.lerDados();
		professor.escrever();
	}

	public Professor getProfessor() {
		return professor;
	}
	
}
