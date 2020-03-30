package com.quiz.modelo;

public class Escolha extends Comum {
	
	private String resposta;
	private boolean ehCorreta;
	
	public Escolha() {
		System.out.println("Digite a alternativa: ");
		this.resposta = sc.next();
		
		System.out.println("Digite 1 se eh correta ou 0 se eh incorreta: ");
		this.ehCorreta = sc.nextInt() == 1;
	}
	
	
	
	public void escrever() {
		
	}
}
