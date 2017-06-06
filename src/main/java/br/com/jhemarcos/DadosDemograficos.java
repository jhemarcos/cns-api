package br.com.jhemarcos;

import java.util.List;

public interface DadosDemograficos {

	String getNome();
	
	List<String> getIds();
	
	List<String> get(int codigo);
}
