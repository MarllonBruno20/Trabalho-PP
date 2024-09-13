package carro;

public class Carro {
    private String marca;
    private String modelo;
    private TipoCarro tipoCarro;

    public Carro(String marca, String modelo, TipoCarro tipoCarro) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCarro = tipoCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
}
