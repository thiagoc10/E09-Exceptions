//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;
import java.util.Objects;

public class PessoaFisica extends Cliente {
    private String cpf;
    private int idade;
    private char genero;

    public PessoaFisica(String nome, String endereco, Date data, String cpf, int idade, char genero) {
        super(nome, endereco, data);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    public String toString() {
        return "cpf=" + this.cpf + "\nidade=" + this.idade + "\ngenero=" + this.genero;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof PessoaFisica) {
            PessoaFisica pessoa = (PessoaFisica)o;
            return Objects.equals(this.cpf, pessoa.cpf);
        } else {
            return false;
        }
    }

    public boolean autenticar(String chave) {
        return this.cpf.equals(chave);
    }

    public double calcularTaxas() {
        return 10.0;
    }
}
