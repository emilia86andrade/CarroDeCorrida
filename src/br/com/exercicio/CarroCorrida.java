package br.com.exercicio;

public class CarroCorrida {

    private Integer numeroCarro;
    private String piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private Boolean ligado;

    public CarroCorrida(Integer numeroCarro, String piloto, float velocidadeMaxima, float velocidadeAtual,
                        Boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;

    }

    public Boolean getLigado() {
        return ligado;
    }

    public Boolean setLigado(Boolean ligado) {
        return this.ligado = ligado;

    }

    @Override
    public String toString() {
        return "\n---Carro de Corrida Fórmula 1---\n" +
                "Número do Carro = " + numeroCarro + "\n" +
                "Piloto = " + piloto + "\n" +
                "Velocidade Máxima = " + velocidadeMaxima + "\n" +
                "Velocidade Atual = " + velocidadeAtual + "\n" +
                "Ligado = " + ligado + "\n";
    }
}
