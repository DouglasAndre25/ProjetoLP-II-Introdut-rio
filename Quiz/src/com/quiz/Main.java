package com.quiz;

import java.util.ArrayList;
import java.util.Scanner;

import com.quiz.controle.CadastrarQuiz;
import com.quiz.controle.ResponderQuiz;
import com.quiz.modelo.Quiz;
import com.quiz.modelo.SituacaoQuiz;

public class Main {
	

	public static void main(String[] args) {
		ArrayList<Quiz> quizzes = new ArrayList<Quiz>();
		ArrayList<SituacaoQuiz> scores = new ArrayList<SituacaoQuiz>();
		while(true) {			
			System.out.println(" ██████╗ ██╗   ██╗██╗███████╗    ██╗   ██╗██████╗ ██╗\r\n" + 
					"██╔═══██╗██║   ██║██║╚══███╔╝    ██║   ██║██╔══██╗██║\r\n" + 
					"██║   ██║██║   ██║██║  ███╔╝     ██║   ██║██████╔╝██║\r\n" + 
					"██║▄▄ ██║██║   ██║██║ ███╔╝      ██║   ██║██╔══██╗██║\r\n" + 
					"╚██████╔╝╚██████╔╝██║███████╗    ╚██████╔╝██║  ██║██║\r\n" + 
					" ╚══▀▀═╝  ╚═════╝ ╚═╝╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝\r\n" + 
					"                                                     ");
			System.out.println("-------------------------------------------------");
			System.out.println("Escolha sua ação:");
			System.out.println("1 - Cadastrar um Quiz");
			System.out.println("2 - Responder um Quiz");
			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			if(i==1) {
				CadastrarQuiz cadastroQuiz = new CadastrarQuiz();
				quizzes.addAll(cadastroQuiz.getProfessor().getQuizzes());
			} else if(i==2) {
				ResponderQuiz responderQuiz = new ResponderQuiz();
				boolean respondeu = responderQuiz.respondeQuiz(quizzes);
				if(respondeu) {
					scores.add(responderQuiz.getSituacaoQuiz());
					if(scores.size() > 0) {						
						System.out.println("===========================================");
						for(SituacaoQuiz item : scores) {
							item.escrever();
						}
						System.out.println("===========================================");					
					}
				}
			}
		}
	}
}
