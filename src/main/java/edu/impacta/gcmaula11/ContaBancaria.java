package edu.impacta.gcmaula11;

public class ContaBancaria {
	private long saldo;
	public ContaBancaria() { saldo = 0; }
	public ContaBancaria(long s) { saldo = s; }
	
	public void depositar(long valor) {
		this.saldo += valor;
		
	}
	
	public boolean sacar(long valor) {
		// FALTA IMPLEMENTAR
		// Se o valor for menor ou igual ao saldo, deve retirar o valor do saldo e retornar true
		// Se o valor ultrapassar o saldo, deve retornar false
		return true;
	}
	
	public long getSaldo() {
		// FALTA IMPLEMENTAR
		// Deve retornar o saldo
		return 0;
	}
	
}
 