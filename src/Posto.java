import java.io.Serializable;

public class Posto implements Serializable {

    private String nomePosto;
    private String bairro;
    private String tipoProduto;
    private float valorVenda;
    private String bandeira;

    // construtor
    public Posto(String nomePosto, String bairro, String tipoProduto, float valorVenda, String bandeira) {
        this.nomePosto = nomePosto;
        this.bairro = bairro;
        this.tipoProduto = tipoProduto;
        this.valorVenda = valorVenda;
        this.bandeira = bandeira;
    }

    // getters e setters
    public String getNomePosto() {
        return nomePosto;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
