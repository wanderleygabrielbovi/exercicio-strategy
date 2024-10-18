package entidades;

public class Produto {
    private String nomeProduto = "";
    private Double precoProduto = 0.0;

    public Produto(String nomeProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }
}
