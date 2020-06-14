package com.quiz.controle;

import java.util.ArrayList;
import java.util.Vector;

import com.quiz.modelo.Aluno;
import com.quiz.modelo.Comum;
import com.quiz.modelo.PerguntaDescritiva;
import com.quiz.modelo.PerguntaObjetiva;
import com.quiz.modelo.Quiz;
import com.quiz.modelo.SituacaoQuiz;

public class ResponderQuiz extends Comum {
	
	private SituacaoQuiz situacaoQuiz;
	
	public SituacaoQuiz getSituacaoQuiz() {
		return situacaoQuiz;
	}

	public ResponderQuiz() {
		super();
		this.situacaoQuiz = new SituacaoQuiz();
	}
	
	public boolean respondeQuiz(ArrayList<Quiz> quizzes) {
		if(quizzes.size() > 0) {
			Quiz quizSelecionado = this.selecionaQuiz(quizzes);
			this.situacaoQuiz.setQuiz(quizSelecionado);
			
			this.situacaoQuiz.setAluno(this.lerAluno());
			
			int score = 0;
			score += this.respondePerguntasObjetivas(quizSelecionado.getPerguntaObjetiva());
			sc.nextLine();
			score += this.respondePerguntasDescritivas(quizSelecionado.getPerguntaDescritiva());
			
			this.situacaoQuiz.setScore(score);
			return true;
		} else {
			System.out.println("O sistema não tem nenhum quiz criado");
			return false;
		}
	}
	
	public int respondePerguntasObjetivas(Vector<PerguntaObjetiva> perguntas) {
		int i=1;
		int score = 0;
		
		for(PerguntaObjetiva item : perguntas) {
			System.out.println(i+"ª pergunta objetiva: ");
			Vector<String> respostas = item.getRespostas();
			
			System.out.println(item.getDescricao());
			System.out.println("-----------------------------------------");
			for(String resposta : respostas) {
				int j=respostas.indexOf(resposta)+1;
				System.out.println(j + ": " + resposta);
			}
			System.out.println("Escolha o numero da alternativa: ");
			int correta = sc.nextInt();
			
			if(respostas.get(correta-1).equals(item.getRespostaCorreta())) {
				System.out.println("Resposta correta");
				score+=item.getPontos();
			} else {
				System.out.println("Desculpe, voce errou");
			}
		}
		return score;
	}
	
	public int respondePerguntasDescritivas(Vector<PerguntaDescritiva> perguntas) {
		int i=1;
		int score = 0;
		for(PerguntaDescritiva item : perguntas) {
			System.out.println(i+"ª pergunta descritiva: ");
			System.out.println(item.getDescricao());
			System.out.println("Digite a resposta: ");
			
			String resposta = sc.nextLine();
			
			if(item.getResposta().equals(resposta)) {
				System.out.println("Resposta correta");
				score+=item.getPontos();
			} else {				
				System.out.println("Desculpe, voce errou!");
			}
			i++;
		}
		return score;
	}
	
	public Aluno lerAluno() {
		Aluno aluno = new Aluno();
		aluno.lerDados();
		return aluno;
	}
	
	public Quiz selecionaQuiz(ArrayList<Quiz> quizzes) {
		int i=1;
		System.out.println("-----------------------------------");
		for(Quiz item: quizzes) {
			System.out.println(i + " - " + item.getDescricao());
			i++;
		}
		System.out.println("-----------------------------------");
		System.out.println("Selecione o quiz: ");
		
		int selecionado = sc.nextInt();
		return quizzes.get(selecionado-1);
	}
}
