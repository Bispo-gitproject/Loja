package br.alura.loja.imposto;

import java.math.BigDecimal;

import br.alura.loja.orcamento.Orcamento;

public class ISS implements Imposto{

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));	
	}
	
	
}
