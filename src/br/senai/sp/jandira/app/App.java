package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria";
		contaMaria.setNumeroAgencia("4214-9");
		contaMaria.depositar(500.0);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println();
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro";
		contaPedro.depositar(200.0);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setNumeroAgencia("4214-9");
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("2315-9");
		contaAna.titular = "Ana";
		contaAna.depositar(350.0);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setNumeroAgencia("4214-9");
		
		
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
		contaMaria.transferir(contaPedro, 300);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
	}

}
