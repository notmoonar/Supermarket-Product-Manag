public class Produto {
    
    public String nome;
    public int id, quant;
    public double preco;

    public Produto(String nome, int id, int quant, double preco) {
        this.nome = nome;
        this.id = id;
        this.quant = quant;
        this.preco = preco;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
