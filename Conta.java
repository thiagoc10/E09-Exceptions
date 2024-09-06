//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Conta implements ITaxas {
    private int numero;
    private Cliente dono;
    private double saldo;
    protected double limite;
    private List<Operacao> operacoes;
    private static int totalContas = 0;

    public Conta(int numero, Cliente dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;
        this.operacoes = new ArrayList();
        ++totalContas;
    }

    public boolean sacar(double valor) {
        if (valor >= 0.0 && valor <= this.limite) {
            this.saldo -= valor;
            this.operacoes.add(new OperacaoSaque(valor));
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor) throws ArithmeticException {
        if (valor < 0.0) {
            throw new ArithmeticException("Erro. Valor negativo depositado.");
        } else {
            this.saldo += valor;
            this.operacoes.add(new OperacaoDeposito(valor));
        }
    }

    public boolean transferir(Conta destino, double valor) {
        boolean valorSacado = this.sacar(valor);
        if (valorSacado) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String var10000 = this.dono.toString();
        return var10000 + "\n---\nnumero=" + this.numero + "\nsaldo=" + this.saldo + "\nlimite=" + this.limite;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Conta) {
            Conta conta = (Conta)o;
            return this.numero == conta.numero;
        } else {
            return false;
        }
    }

    public void imprimirExtrato(int modo) {
        List<Operacao> operacoesParaExtrato = new ArrayList(this.operacoes);
        if (modo == 1) {
            Collections.sort(operacoesParaExtrato);
        }

        System.out.println("======= Extrato Conta " + this.numero + "======");
        Iterator var3 = operacoesParaExtrato.iterator();

        while(var3.hasNext()) {
            Operacao atual = (Operacao)var3.next();
            System.out.println(atual);
        }

        System.out.println("====================");
    }

    public void imprimirExtratoTaxas() {
        System.out.println("=== Extrato de Taxas ===");
        System.out.printf("Manutenção:\t%.2f\n", this.calcularTaxas());
        double totalTaxas = this.calcularTaxas();
        Iterator var3 = this.operacoes.iterator();

        while(var3.hasNext()) {
            Operacao atual = (Operacao)var3.next();
            totalTaxas += atual.calcularTaxas();
            System.out.printf("%c:\t%.2f\n", atual.getTipo(), atual.calcularTaxas());
        }

        System.out.printf("Total:\t%.2f\n", totalTaxas);
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getDono() {
        return this.dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public abstract void setLimite(double var1);
}
