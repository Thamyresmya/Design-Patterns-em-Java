package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class SalvarPedidoNoBD implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){

        System.out.println("Salvando pedido no Banco de dados!");
    }


}
