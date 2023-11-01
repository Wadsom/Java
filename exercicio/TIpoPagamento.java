package exercicio;

public enum TIpoPagamento {
    CREDITO() {
        @Override
        public double Desconto(double valor) {
            return valor - (valor * 0.5);
        }
    },
    DEBITO {
        @Override
        public double Desconto(double valor) {
            return valor - (valor * 0.1);
        }
    };

    public abstract double Desconto(double valor);

}
