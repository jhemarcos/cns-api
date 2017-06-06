package com.github.cns;

/**
 * Permite montagem e requisi��o de consulta aos servi�os do CNS oferecidos
 * pelo DATASUS.
 * 
 */
public interface Cns {
	
	/**
	 * Recupera dados demogr�ficos para o CPF fornecido.
	 */
	DadosDemograficos buscaPorCPF(String cpf);
	
}