package br.alura.loja.descontos;

import java.math.BigDecimal;

import br.alura.loja.orcamento.Orcamento;

public class DescontoValorCompra extends Desconto{

	public DescontoValorCompra(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean devAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor().compareTo(new BigDecimal(500)) > 0;
	}
}
