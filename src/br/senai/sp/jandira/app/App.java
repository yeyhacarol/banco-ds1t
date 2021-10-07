package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		Agencia agencia = new Agencia();
		agencia.setNumeroAgencia("4214-9");
		agencia.setNomeGerente("Beatriz Moraes");
		agencia.setTelefoneAgencia("(11) 98724-9650");
		agencia.setCidadeAgencia("São Paulo");
		
		//Criação da cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("maria.antonieta@gmail.com");
		clienteMaria.setSalario(1815);
		
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setNumeroAgencia(agencia);
		contaMaria.depositar(500.0);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println();
		
		//Criação do cliente do Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro.cabral@outlook.com");
		clientePedro.setSalario(1560);;
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200.0);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setNumeroAgencia(agencia);
		
		//Criação da cliente da Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Clara");
		clienteAna.setEmail("ana.clara@live.com");
		clienteAna.setSalario(1987);
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("2315-9");
		contaAna.setCliente(clienteAna);
		contaAna.depositar(350.0);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setNumeroAgencia(agencia);
		
		
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
