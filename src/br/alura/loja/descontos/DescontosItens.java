package br.alura.loja.descontos;

import java.math.BigDecimal;

import br.alura.loja.orcamento.Orcamento;

public class DescontosItens extends Desconto  {
	
	public DescontosItens(Desconto proximo) {
		super(proximo);
	}

	protected BigDecimal efetuarCalculo(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.1"));

	}

	@Override
	public boolean devAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getQuantidadeItens() > 5;
	}

}
