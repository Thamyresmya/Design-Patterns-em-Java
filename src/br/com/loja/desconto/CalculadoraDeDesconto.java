package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto cadeiaDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                                 new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                                        new SemDesconto()));

         return cadeiaDeDesconto.calcular(orcamento);

    }
}
