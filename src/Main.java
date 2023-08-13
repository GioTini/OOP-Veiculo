import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat",
                "Uno",
                "branca",
                200,
                LocalDate.of(1980, 9, 23),
                54);

        carro.ligarMotor();
        carro.acelerar();
        carro.frear();
        carro.desligarMotor();

        CarroEletrico carroEletrico = new CarroEletrico("Fiat",
                "Uno",
                "amarelo",
                300,
                LocalDate.of (2000, 3, 11),
                67);

        carroEletrico.ligarMotor();
        carroEletrico.acelerar();
        carroEletrico.frear();
        carroEletrico.desligarMotor();
    }
}
