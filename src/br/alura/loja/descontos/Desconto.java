package br.alura.loja.descontos;

import java.math.BigDecimal;

import br.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(devAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	public abstract boolean devAplicar(Orcamento orcamento);  
	
}
