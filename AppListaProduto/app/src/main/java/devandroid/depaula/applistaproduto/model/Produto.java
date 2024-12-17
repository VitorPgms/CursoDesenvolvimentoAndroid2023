package devandroid.depaula.applistaproduto.model;

public class Produto {
    private String nome;
    private String cor;
    private String quantidade;
    private String preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }

    public Produto(){

    }
}
