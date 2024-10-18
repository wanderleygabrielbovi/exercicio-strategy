package strategies;

public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public Double calcularDesconto(double valor) {
        return valor;
    }
}
