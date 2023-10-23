package br.alura.loja.teste;

import java.math.BigDecimal;

import br.alura.loja.descontos.CalculadoraDesconto;
import br.alura.loja.imposto.CalculadoraImposto;
import br.alura.loja.imposto.FGTS;
import br.alura.loja.imposto.ICMS;
import br.alura.loja.imposto.ISS;
import br.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

		public static void main(String[] args) {
			Orcamento orcamento = new Orcamento(new  BigDecimal("600"), 6);
						
			CalculadoraDesconto calculadora = new CalculadoraDesconto();
			
			System.out.println(calculadora.calcular(orcamento));
		}
}
