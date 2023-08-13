import java.time.LocalDate;

public class CarroEletrico extends Automovel {

    private final int autonomiaBateria;
    private boolean estaCarregado;

    public CarroEletrico(String marca, String modelo, String cor, int velocidadeMaxima, LocalDate anoFabricacao, int autonomiaBateria) {
        super(marca, modelo, cor, velocidadeMaxima, anoFabricacao);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public boolean isEstaCarregado() {
        return estaCarregado;
    }

    @Override
    public void acelerar() {
        var novaVelocidade = this.velocidadeAtual + 15;
        if (novaVelocidade > getVelocidadeMaxima()) {
            System.err.println("Carro não pode ultrapassar sua velocidade maxima");
        } else {
            this.velocidadeAtual = novaVelocidade;
        }
    }

    @Override
    public void frear() {
        var novaVelocidade = this.velocidadeAtual - 15;
        if (novaVelocidade < getVelocidadeMaxima()) {
            System.err.println("Carro está parado");
        } else {
            this.velocidadeAtual = novaVelocidade;
        }
    }
}
