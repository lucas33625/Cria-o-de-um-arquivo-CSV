package Entities;

public class Produtos {
    private String nome;
    private Double preço;
    private Integer quantidade;

    public Produtos(String nome, Double preço, Integer quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double total ()  {
        return preço * quantidade;
    }

    public String toString () {
        return "Nome: "
                + nome
                + ", Preço $ " +
                String.format("%.2f", preço)
                + ", Quantidade em estoque: " + quantidade;
    }
}
