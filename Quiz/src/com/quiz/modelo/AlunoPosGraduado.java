package com.quiz.modelo;

public class AlunoPosGraduado extends Aluno {

	private String graduacao;
	private String instituicao;
	private int comecoGraduacao;
	private int finalGraduacao;
	private Curso posGraduacao;

	public AlunoPosGraduado() {
		super();
	}

	@Override
	public void lerDados() {
		System.out.println("Digite a graduacao que o aluno fez:");
		while (!this.setGraduacao(sc.nextLine()));
		
		System.out.println("Digite o nome da instituicao: ");
		while(!this.setInstituicao(sc.nextLine()));
		
		System.out.println("Digite o ano que ingressou no curso:");
		while(!this.setComecoGraduacao(sc.nextInt()));
		
		System.out.println("Digite o ano em que terminou o curso " + this.graduacao + ":");
		while(!this.setFinalGraduacao(sc.nextInt()));
		
		System.out.println("Agora pos graduacao que esta fazendo");
		Curso curso = new Curso("Pos graduacao");
		this.posGraduacao = curso;
	}
	
	@Override
	public void escrever() {
		super.escrever();
		System.out.println("Formado em: " + this.graduacao);
		System.out.println("Na instituicao: " + this.instituicao);
		System.out.println("Ano que entrou no curso: " + this.comecoGraduacao);
		System.out.println("Ano que concluiu o curso: " + this.finalGraduacao);
		this.posGraduacao.escrever();	
	}

	public String getGraduacao() {
		return graduacao;
	}

	public boolean setGraduacao(String graduacao) {
		if (graduacao.equals("")) {
			this.dadoInvalido();
			return false;
		}

		this.graduacao = graduacao;
		return true;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public boolean setInstituicao(String instituicao) {
		if(instituicao.equals("")) {
			this.dadoInvalido();
			return false;
		}
		
		this.instituicao = instituicao;
		return true;
	}

	public int getComecoGraduacao() {
		return comecoGraduacao;
	}

	public boolean setComecoGraduacao(int comecoGraduacao) {
		if(comecoGraduacao < 0) {
			this.dadoInvalido();
			return false;
		}
		
		this.comecoGraduacao = comecoGraduacao;
		return true;
	}

	public int getFinalGraduacao() {
		return finalGraduacao;
	}

	public boolean setFinalGraduacao(int finalGraduacao) {
		if(finalGraduacao < 0) {
			this.dadoInvalido();
			return false;
		}
		
		this.finalGraduacao = finalGraduacao;
		return true;
	}

}
