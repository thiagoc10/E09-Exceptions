//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ContaUniversitaria extends Conta {
    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    public double calcularTaxas() {
        return 0.0;
    }

    public void setLimite(double limite) {
        if (limite <= 500.0 && limite >= 0.0) {
            super.limite = limite;
        }

    }

    public void checaLimite(double limite) throws IllegalArgumentException {
        if (!(limite < 0.0) && !(limite > 500.0)) {
            this.setLimite(limite);
        } else {
            throw new IllegalArgumentException("Valor está fora do limite");
        }
    }
}
