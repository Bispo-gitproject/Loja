package br.alura.loja.descontos;

import java.math.BigDecimal;

import br.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto  {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean devAplicar(Orcamento orcamento) {
		return true;
	}

}
