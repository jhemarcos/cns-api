package br.com.jhemarcos;

import java.util.List;

/**
 * Representa a resposta do barramento datasus a uma consulta PDQ
 *
 */
public interface DadosDemograficos {

	/**
	 * Retorna uma informação contida dentro do objeto {@link DadosDemograficos}
	 * de acordo com o código repassado
	 * @param codigo int
	 * @return {@link String}
	 */
	String get(int codigo);
	
	/**
	 * Retorna uma lista de informações contidas dentro do objeto {@link DadosDemograficos}
	 * de acordo com o código repassado
	 * @param codigo int
	 * @return {@link String}
	 */
	List<String> getIds(int codigo);
}
