package com.quiz.modelo;

import java.util.Vector;

public class PerguntaObjetiva extends Pergunta {

	private Vector<String> respostas = new Vector<String>();
	private String respostaCorreta;
	
	public PerguntaObjetiva() {
		super("objetiva");
		respostaCorreta="";
	}

	@Override
	public void lerDados() {
        super.lerDados();
		System.out.println("Agora a parte das respostas");
		boolean temResposta = true;
		
		while(this.respostas.size() <= 5 && temResposta) {
			System.out.println("Insira uma resposta para a pergunta");
			while(!this.setRespostas(sc.nextLine()));
			if(respostaCorreta.equals("")) {				
				System.out.println("É a resposta correta? (y/n)");
				boolean ehCorreta = sc.next().toLowerCase().equals("y");
				if(ehCorreta) {
					respostaCorreta = this.respostas.lastElement();
				}
				sc.nextLine();
			}
			if(!respostaCorreta.equals("") && this.respostas.size() >= 2) {				
				System.out.println("Adicionar mais respostas? (y/n)");
				temResposta = sc.next().toLowerCase().equals("y");
				sc.nextLine();
			}
		}
	}
	
	@Override
	public void escrever() {
		super.escrever();
		System.out.println("Lista das respostas: ");
		for(int i=0; i<this.respostas.size(); i++) {
			System.out.println(respostas.get(i));
		}
		System.out.println("Resposta correta: " + this.respostaCorreta);
	}
	
	public Vector<String> getRespostas() {
		return respostas;
	}

	public boolean setRespostas(String respostas) {
		if(respostas.equals("")) {
			this.dadoInvalido();
			return false;
		} else {			
			this.respostas.add(respostas);
			return true;
		}
		
	}

	public String getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}
	
}
