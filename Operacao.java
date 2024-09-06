//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;

public abstract class Operacao implements ITaxas, Comparable<Operacao> {
    private Date data;
    private char tipo;
    private double valor;
    private static int totalOperacoes = 0;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date();
        ++totalOperacoes;
    }

    public String toString() {
        return String.format("%s\t%s\t%s", this.data, this.tipo, this.valor);
    }

    public int compareTo(Operacao outro) {
        return this.getTipo() - outro.getTipo();
    }

    public Date getData() {
        return this.data;
    }

    public char getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }

    public static int getTotalOperacoes() {
        return totalOperacoes;
    }

    public void setTipo(char tipo) {
        if (tipo == 'd' || tipo == 's') {
            this.tipo = tipo;
        }

    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
