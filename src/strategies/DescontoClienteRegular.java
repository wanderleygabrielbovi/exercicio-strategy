package strategies;

public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public Double calcularDesconto(double valor) {
        return valor - (valor * 0.10);
    }
}
