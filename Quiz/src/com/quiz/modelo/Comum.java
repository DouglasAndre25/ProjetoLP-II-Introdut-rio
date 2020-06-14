package com.quiz.modelo;

import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

public class Comum {

	public Scanner sc;
	private String id;
	
	public Comum() {
		this.sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}
	
	public void dadoInvalido() {
		System.out.println("Dado Invalido, digite novamente: ");
	}
}
