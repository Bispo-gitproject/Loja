package br.alura.loja.imposto;

import java.math.BigDecimal;

import br.alura.loja.orcamento.Orcamento;

public class CalculadoraImposto {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
