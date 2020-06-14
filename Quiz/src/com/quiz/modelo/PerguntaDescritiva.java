package com.quiz.modelo;

public class PerguntaDescritiva extends Pergunta {

	private String resposta;
	
	public PerguntaDescritiva() {
		super("Descritiva");
	}

	@Override
	public void lerDados() {
		super.lerDados();
		System.out.println("Digite a resposta da pergunta");
		while(!this.setResposta(sc.nextLine()));
	}

	@Override
	public void escrever() {
		super.escrever();
		System.out.println("Resposta da pergunta: " + this.resposta);
	}
	
	public String getResposta() {
		return resposta;
	}

	public boolean setResposta(String resposta) {
		if(resposta.equals("")) {
			this.dadoInvalido();
			return false;
		}
		
		this.resposta = resposta;
		return true;
	}
}
