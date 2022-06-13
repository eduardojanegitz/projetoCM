package model;

/**
 *
 * @author Eduardo
 */
public class Produtos {

   
    private int id;
    private String nomeProduto;
    private String descricao;
    private double preco;
    private int qtd_estoque;

    private Mercados mercados;

     public void setMercados(Mercados mercados) {
        this.mercados = mercados;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public Mercados getMercados() {
        return mercados;
    }
}
