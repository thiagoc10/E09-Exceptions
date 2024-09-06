//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;

public abstract class Cliente implements ITaxas {
    private String nome;
    private String endereco;
    private Date data;

    public Cliente(String nome, String endereco, Date data) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
    }

    public abstract boolean autenticar(String var1);

    public void imprimir() {
        System.out.println("CLIENTE INVÁLIDO!");
    }

    public String toString() {
        String var10000 = this.nome;
        return "nome=" + var10000 + "\nendereco=" + this.endereco + "\ndata=" + String.valueOf(this.data) + "\n";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
