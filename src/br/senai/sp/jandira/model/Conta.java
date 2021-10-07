package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	private TipoConta tipo;
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private double saldo;
	
	//m�todo construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;	
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setNumeroAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Agencia getNumeroAgencia() {
		return agencia;
	}
	
	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	
	public void depositar(double valorDeposito) {

		if (valorDeposito <= 0) {
			System.out.println("N�o � poss�vel depositar valores negativos.");
		} else {
			saldo += valorDeposito;	
		}
		
	}
	
	public boolean sacar(double valorSaque) {
		
		if (valorSaque <= 0) {
			System.out.println("N�o � poss�vel sacar valores negativos.");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("A conta n�o possui saldo suficiente para o saque.");
			return false;
		}else {
			saldo -= valorSaque;
			return true;
		}
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel efetuar transf�ncia.");
		}
		
	}
	
	
	
	public void exibirDetalhes() {
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", agencia.getNumeroAgencia());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
		System.out.println();
		System.out.println("---------------------");
	}
	 
}
