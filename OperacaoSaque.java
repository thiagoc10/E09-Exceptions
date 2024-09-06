//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class OperacaoSaque extends Operacao {
    public OperacaoSaque(double valor) {
        super('s', valor);
    }

    public double calcularTaxas() {
        return 0.05;
    }
}
