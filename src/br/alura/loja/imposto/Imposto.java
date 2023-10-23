package br.alura.loja.imposto;

import java.math.BigDecimal;

import br.alura.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
