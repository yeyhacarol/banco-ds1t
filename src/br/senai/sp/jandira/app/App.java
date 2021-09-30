package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.depositar(500.0);
		contaMaria.tipo = "Corrente";
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro";
		contaPedro.depositar(200.0);
		contaPedro.tipo = "Poupança";
		contaPedro.numeroAgencia = "4214-9";
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("2315-9");
		contaAna.titular = "Ana";
		contaAna.depositar(350.0);
		contaAna.tipo = "Corrente";
		contaAna.numeroAgencia = "4214-9";
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println("_____________________");
		System.out.println();
		
		//Depósito de 100 reais na conta da Joana
		contaMaria.depositar(200);
		contaMaria.exibirDetalhes();
		
		System.out.println("_____________________");
		System.out.println();
		
		//Saque de 100 reais da conta da Maria
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();
		
		//Transferir 200 reais da conta da Maria para a conta do Pedro
		contaMaria.transferir(contaPedro, 2000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
	}

}
