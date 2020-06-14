package com.quiz.modelo;

public class SituacaoQuiz extends Comum {

	private Quiz quiz;
	private Aluno aluno;
	private double score;

	public SituacaoQuiz() {
		super();
	}

	public void escrever() {
		System.out.println(this.aluno.getNome() + " - " + this.quiz.getDescricao() + " - "
				+ this.score);
	}
	
	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
