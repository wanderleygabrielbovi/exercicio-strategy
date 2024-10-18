package strategies;

public class DescontoClienteVip implements DescontoStrategy {
    @Override
    public Double calcularDesconto(double valor) {
        return valor - (valor * 0.20);
    }
}
