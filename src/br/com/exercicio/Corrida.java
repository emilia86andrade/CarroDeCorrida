package br.com.exercicio;


public class Corrida {
    public static void main(String[] args) {

        CarroCorrida carroEmilia = new CarroCorrida(44, "Emilia",360.00f,
                00.00f, true);

        Piloto piloto = new Piloto("Maria Teresa di Filippis", 22, Sexo.FEMININO, "Equipe Maserati "
                + "e Porsche");

        carroEmilia.getPiloto();
        System.out.println(carroEmilia);

        System.out.println("---Ações do Carro de Corrida Fórmula 1---");
        acelerar(100.00f, carroEmilia);
        frear(50.00f, carroEmilia);
        parar(carroEmilia.getVelocidadeAtual(), carroEmilia);
        ligar(carroEmilia.getVelocidadeAtual(), carroEmilia);
        desligar(carroEmilia.getVelocidadeAtual(), carroEmilia);

        piloto.getNome();
        System.out.println(piloto);
    }

    public static float acelerar(float acelerarVelocidade, CarroCorrida carroCorrida) {
        float novaVelocidadeAcelerada = acelerarVelocidade + carroCorrida.getVelocidadeAtual();
        if (carroCorrida.getLigado() == true && carroCorrida.getVelocidadeAtual() == 0 && novaVelocidadeAcelerada == 0){
            System.out.println("O carro está ligado e parado.");
        } else if (novaVelocidadeAcelerada <= carroCorrida.getVelocidadeMaxima() && carroCorrida.getLigado() == true) {
            carroCorrida.setVelocidadeAtual(novaVelocidadeAcelerada);
            System.out.println("Ao acelerar, a velocidade do carro está em " + novaVelocidadeAcelerada + " km/h.");
        } else if (carroCorrida.getLigado() == false) {
            System.out.println("O carro está desligado. Para acelerar o carro, você precisa de ligá-lo.");
        } else {
            carroCorrida.setVelocidadeAtual(carroCorrida.getVelocidadeAtual());
            System.out.println("A velocidade do carro não pode ultrapassar a velocidade máxima permitida.");
        }
        return novaVelocidadeAcelerada;
    }

    public static void frear(float desacelerarVelocidade, CarroCorrida carroCorrida) {
        float novaVelocidadeDesacelerada = carroCorrida.getVelocidadeAtual() - desacelerarVelocidade;
        carroCorrida.setVelocidadeAtual(novaVelocidadeDesacelerada);
        if (novaVelocidadeDesacelerada < 0 && carroCorrida.getLigado() == true) {
            System.out.println("O carro está parado. Para frear, o carro precisa estar em movimento.");
        } else if (carroCorrida.getVelocidadeAtual() > 0 && carroCorrida.getLigado() == true) {
            System.out.println("Ao frear, a velocidade do carro está em " + carroCorrida.getVelocidadeAtual() +
                    " km/h.");
        } else {
            System.out.println("O carro está parado.");
        }
    }

    public static void parar(float velocidadeAtual, CarroCorrida carroCorrida) {
        if (carroCorrida.getVelocidadeAtual() <= 0) {
            System.out.println("O carro já está parado.");
        } else {
            System.out.println("O carro está em movimento.");
        }
    }

    public static void ligar(float velocidadeAtual, CarroCorrida carroCorrida) {
        if (carroCorrida.getLigado() == true && carroCorrida.getVelocidadeAtual() < 0) {
            carroCorrida.setLigado(true);
            System.out.println("O carro está parado e pronto para ser ligado.");
        } else if (carroCorrida.getLigado() == false) {
            System.out.println("O carro está desligado.");
            carroCorrida.setLigado(false);
        } else
            System.out.println("O carro já está ligado.");
        }

    public static void desligar(float velocidadeAtual, CarroCorrida carroCorrida) {
        if (carroCorrida.getLigado() == false && carroCorrida.getVelocidadeAtual() <= 0) {
            System.out.println("O carro está desligado.");
        } else if (carroCorrida.getVelocidadeAtual() == 0){
            System.out.println("A velocidade do carro é zero, o carro já pode ser desligado.");
        } else {
            System.out.println("Para desligar o carro, a velocidade do carro deve ser zero.");
        }
    }
}
