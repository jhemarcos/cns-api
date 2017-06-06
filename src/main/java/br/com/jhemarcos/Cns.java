package br.com.jhemarcos;

/**
 * Permite montagem e requisição de consulta aos serviços do CNS oferecidos
 * pelo DATASUS.
 */
public interface Cns {
	
	/**
	 * Recupera dados demográficos para o cns fornecido.
	 * @param cns {@link String}
	 * @return {@link DadosDemograficos}
	 */
	DadosDemograficos buscaPorCNS(String cns);
	
	/**
	 * Recupera dados demográficos para o CPF fornecido.
	 * @param cpf {@link String}
	 * @return {@link DadosDemograficos}
	 */
	DadosDemograficos buscaPorCPF(String cpf);
	
	/**
	 * Recupera dados demográficos para o nome fornecido.
	 * @param nome {@link String}
	 * @return {@link DadosDemograficos}
	 */
	DadosDemograficos buscaPorNome(String nome);
	
	/**
	 * Recupera dados demográficos para o nome da mãe fornecido.
	 * @param nomeMae {@link String}
	 * @return {@link DadosDemograficos}
	 */
	DadosDemograficos buscaPorNomeMae(String nomeMae);
	
}