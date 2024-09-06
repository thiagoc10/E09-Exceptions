//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Cliente joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627", new Date(), "111.111.111-11", 36, 'm');
        Cliente lojinha = new PessoaJuridica("Loja R$1,99", "Av. Afonso Pena, 3000", new Date(), "000.00000.0000/0001", 25, "Comércio");
        new ContaCorrente(1234, joao, 0.0, 1500.0);
        new ContaPoupanca(12121, lojinha, 10000.0, 1500.0);
        boolean correto = false;
        ContaCorrente j = new ContaCorrente(14, joao, 10.0, 10.0);

        try {
            j.checaLimite(-1000.0);
        } catch (Exception var9) {
            Exception a = var9;
            System.out.println(a.getMessage());
        }

    }
}
