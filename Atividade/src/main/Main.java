package main;

import java.util.Scanner;

import Classes.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno ("Ferdinando", "POO", 10.00, 10.00, 10.00);
		
		double nota1;
		double nota2;
		double nota3;
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.println("Digite o nome da disciplina: ");
		String disciplina = sc.nextLine();
        
        System.out.print("Digite a nota 1: ");
        nota1 = sc.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        nota2 = sc.nextDouble();
        
        System.out.print("Digite a nota 3: ");
        nota3 = sc.nextDouble();
        
        Aluno aluno1 = new Aluno(nome, disciplina, nota1, nota2, nota3);
        
        aluno1.info();
        
        sc.close();
        
	}

}