/**
 * 
 */
package br.com.aulajava;

import java.util.Scanner;

/**
 * @author samue
 *
 */
public class TreinandoScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crie um programa que leia o seu 
		 * String nome; int idade; float peso;
		 * imprimir
		 * Meu nome * �...
		 * Minha idade �...
		 * Meu peso �...
		 */
		Scanner sc = new Scanner(System.in);
		System.out.printf("Informe o seu  nome:");
		String nome = sc.nextLine();
		System.out.printf("Informe a sua idade:");
		int idade = sc.nextInt();
		System.out.printf("Informe o seu peso:");
		float peso = sc.nextFloat();
		
		System.out.printf("Meu nome � %s \n",nome);
		System.out.printf("Eu tenho %d anos de idade \n",idade);
		System.out.printf("Estou pesando atualmente %2.2f",peso);
		
		System.out.printf("\n Meu nome � %s \n Tenho %d anos de idade \n e estou pesando %.2f",  nome, idade,peso);
		
		// && testa se duas condi��es s�o verdadeiras, caso seja retorna true
		// || testa se uma das condi��es � verdadeira, caso seja retorna true

		//metodo verificaIdade(peso,idade,nome) dentro da classe TreinandoScanner
verificaIdadeEPeso(peso, idade, nome);
		//metodo verificaIdadeComSwitch(idade) dentro da classe TreinandoScanner
verificaIdadeComSwitch(idade);
	}

	public static void verificaIdadeEPeso(float peso, int idade, String nome) {
//&& testa se duas condi��es s�o verdadeiras, caso sejam retorna true
//|| testa se uma das condi��es � verdadeira, caso seja retorna true
//! nega o booleano !true = false;
if ((peso > 80 && idade > 40) || nome.equals("Marcus")) { System.out.println("Voc� precisa correr mais");
	} else { System.out.println("Coma mais carboidratos");
		}
	}
public static void verificaIdadeComSwitch(int idade) {
switch (idade) {
case 80: System.out.println("Parab�ns pelos seus 80 anos!");
break;
case 40: System.out.println("Parab�ns pelos seus 40 anos!");
break;
default: System.out.println("Voc� ainda � jovem!");
break;
		}
	}
}