package br.com.loja.orcamento.situacao;

import br.com.loja.orcamento.Orcamento;


public class Reprovado extends SituacaoOrcamento{

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
