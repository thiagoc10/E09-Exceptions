//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String nome, String endereco, Date data, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco, data);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public String toString() {
        return "cnpj=" + this.cnpj + "\nnumFuncionarios=" + this.numFuncionarios + "\nsetor=" + this.setor;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica)o;
            return this.cnpj.equals(pj.getCnpj());
        } else {
            return false;
        }
    }

    public boolean autenticar(String chave) {
        return this.cnpj.equals(chave);
    }

    public double calcularTaxas() {
        return 20.0;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return this.numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
