package com.quiz.modelo;

import java.util.Scanner;
import java.util.UUID;

public class Comum {

	public Scanner sc;
	private String id;
	
	public Comum() {
		this.sc = new Scanner(System.in);
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

}
