package com.quiz.modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Quiz extends Comum {

	private String descricao;
	private int situacao;
	private Vector<PerguntaDescritiva> perguntaDescritiva = new Vector<PerguntaDescritiva>();
	private Vector<PerguntaObjetiva> perguntaObjetiva = new Vector<PerguntaObjetiva>();
	
	public Map<String, Integer> situacaoByte = new HashMap<String, Integer>() {{
		put("R", 1);
		put("P", 2);
		put("I", 3);
	}};

	public Quiz() {
		super();
	}
	
	public void lerDados() {
		System.out.println("Digite a descricao do Quiz: ");
		while(!this.setDescricao(sc.nextLine()));
		
		System.out.println("Digite a situação do Quiz:\r\n"
				+ " - R para rascunho\r\n" + 
				"– P para pronto\r\n" + 
				"– I para inativo");
		
		String inputSituacao = sc.nextLine();
		while(!this.situacaoByte.containsKey(inputSituacao.toUpperCase())) {
			this.dadoInvalido();
			inputSituacao = sc.nextLine();
		}
		this.setSituacao(this.situacaoByte.get(inputSituacao.toUpperCase()));
				
		boolean temPergunta = true;
		while(temPergunta) {			
			System.out.println("Adicionar uma pergunta objetiva ou descritiva? (O/D)");
			String tipoPergunta = sc.nextLine();
			while(!tipoPergunta.toLowerCase().equals("o") && !tipoPergunta.toLowerCase().equals("d")) {
				this.dadoInvalido();
				tipoPergunta = sc.nextLine();
			}
			if(tipoPergunta.toLowerCase().equals("o")) {
				this.adicionarObjetiva(new PerguntaObjetiva());
			} else {
				this.adicionarDescritiva(new PerguntaDescritiva());
			}
			System.out.println("Adicionar mais uma pergunta? (y/n)");
			temPergunta = sc.next().toLowerCase().equals("y");
			sc.nextLine();
		}
		
	}
	
	public void adicionarObjetiva(PerguntaObjetiva perguntaObjetiva) {
		perguntaObjetiva.lerDados();
		this.perguntaObjetiva.add(perguntaObjetiva);
	}
	
	public void adicionarDescritiva(PerguntaDescritiva perguntaDescritiva) {
		perguntaDescritiva.lerDados();
		this.perguntaDescritiva.add(perguntaDescritiva);
	}
	
	public void escrever() {
		System.out.println("--------------------------------");
		System.out.println("Descricao: " + this.descricao);
		System.out.println("Situação: 1 para rascunho, 2 para pronto, 3 para inativo: "+this.getSituacao());

		for(PerguntaDescritiva item : perguntaDescritiva) {
			item.escrever();
		}

		for(PerguntaObjetiva item : perguntaObjetiva) {
			item.escrever();
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean setDescricao(String descricao) {
		if(descricao.equals("")) {
			this.dadoInvalido();
			return false;
		}
		
		this.descricao = descricao;
		return true;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
			this.situacao = situacao;
	}

	public Vector<PerguntaDescritiva> getPerguntaDescritiva() {
		return perguntaDescritiva;
	}

	public Vector<PerguntaObjetiva> getPerguntaObjetiva() {
		return perguntaObjetiva;
	}

}
