package Estoque;

public class Peca {

    private String nome;

    private float preco;

    private Categoria categoria;

    public float getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public <any> getFornecedores() {
        return fornecedores;
    }

    public <any> getProdutos() {
        return produtos;
    }

    private ArrayList<Fornecedor> fornecedores;

    private ArrayList<Produto> produtos;

    public Peca(String nome, float preco, Categoria categoria) {
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void acrescentarFornecedor(Fornecedor fonecedor) {
    }
}
