package br.alura.loja.teste;

import java.math.BigDecimal;

import br.alura.loja.imposto.CalculadoraImposto;
import br.alura.loja.imposto.FGTS;
import br.alura.loja.imposto.ICMS;
import br.alura.loja.imposto.ISS;
import br.alura.loja.orcamento.Orcamento;

public class TesteImposto {

		public static void main(String[] args) {
			Orcamento orcamento = new Orcamento(new  BigDecimal("5000"), 1);
			CalculadoraImposto calculadora = new CalculadoraImposto();
			System.out.println(calculadora.calcular(orcamento, new ICMS()));
			System.out.println(calculadora.calcular(orcamento, new ISS()));
			System.out.println(calculadora.calcular(orcamento, new FGTS()));

		}
}
