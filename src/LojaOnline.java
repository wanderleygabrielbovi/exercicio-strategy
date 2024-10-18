import entidades.Produto;
import servicos.CarrinhoCompras;
import strategies.DescontoClienteNovo;
import strategies.DescontoClienteRegular;
import strategies.DescontoClienteVip;

public class LojaOnline {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("camiseta", 50.00);
        Produto produto2 = new Produto("calca", 100.00);
        Produto produto3 = new Produto("tenis", 200.0-0);

        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para cliente novo: R$" + carrinho.calcularTotalDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para cliente regular: R$" + carrinho.calcularTotalDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteVip());
        System.out.println("Total para cliente vip: R$" + carrinho.calcularTotalDesconto());
    }
}
