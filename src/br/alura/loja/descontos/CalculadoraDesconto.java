package br.alura.loja.descontos;

import java.math.BigDecimal;

import br.alura.loja.orcamento.Orcamento;

public class CalculadoraDesconto {
		
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiadesconto = new DescontosItens(
				new DescontoValorCompra(
						new SemDesconto())); 
		
		return cadeiadesconto.calcular(orcamento);
		
	}
}
