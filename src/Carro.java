import java.time.LocalDate;

public class Carro extends Automovel {

    private final int autonomia;
    private boolean estaAbastecido;

    public Carro(String marca, String modelo, String cor, int velocidadeMaxima, LocalDate anoFabricacao, int autonomia) {
        super(marca, modelo, cor, velocidadeMaxima, anoFabricacao);
        this.autonomia = autonomia;
    }


    public int getAutonomia() {
        return autonomia;
    }

    public boolean isEstaAbastecido() {
        return estaAbastecido;
    }

    @Override
    public void acelerar() {
        var novaVelocidade = this.velocidadeAtual + 5;
        if (novaVelocidade > getVelocidadeMaxima()) {
            System.err.println("Carro não pode ultrapassar sua velocidade maxima");
        } else {
            this.velocidadeAtual = novaVelocidade;
        }
    }

    @Override
    public void frear() {
        var novaVelocidade = this.velocidadeAtual - 5;
        if (novaVelocidade < getVelocidadeMaxima()) {
            System.err.println("Carro está parado");
        } else {
            this.velocidadeAtual = novaVelocidade;
        }
    }
}
