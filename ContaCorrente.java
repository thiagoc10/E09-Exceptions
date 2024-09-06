//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    public double calcularTaxas() {
        return this.getDono().calcularTaxas();
    }

    public void setLimite(double limite) {
        if (limite >= -100.0) {
            super.limite = limite;
        }

    }

    public void checaLimite(double limite) throws IllegalArgumentException {
        if (limite < -100.0) {
            throw new IllegalArgumentException("Valor fora do limite");
        } else {
            this.setLimite(limite);
        }
    }
}
