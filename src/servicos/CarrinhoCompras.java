package servicos;

import entidades.Produto;
import strategies.DescontoStrategy;

import java.util.ArrayList;

public class CarrinhoCompras {
    private DescontoStrategy descontoStrategy;
    private ArrayList<Produto> lista = new ArrayList<>();
    public void adicionarProduto (Produto produto) {
        this.lista.add(produto);
    }

    public Double calcularTotalDesconto() {
        Double total = 0.0;
        for (Produto produto : this.lista) {
            total += produto.getPrecoProduto();
        }

        return this.descontoStrategy.calcularDesconto(total);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }
}