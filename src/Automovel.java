import java.time.LocalDate;

public abstract class Automovel {

    private final String marca;
    private final String modelo;
    private final String cor;
    protected int velocidadeAtual;
    private final int velocidadeMaxima;
    private boolean estaLigado;
    private final LocalDate anoFabricacao;

    public Automovel(String marca, String modelo, String cor, int velocidadeMaxima, LocalDate anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public void ligarMotor() {
        this.estaLigado = true;
    }

    public void desligarMotor() {
        this.estaLigado = false;
    }

    public abstract void acelerar();

    public abstract void frear();
}
