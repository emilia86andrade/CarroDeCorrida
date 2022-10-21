package br.com.exercicio;

public class Piloto {
    private String nome;
    private Integer idade;
    private Sexo sexo;
    private String equipe;

    public Piloto(String nome, Integer idade, Sexo sexo, String equipe) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "\n---Primeira Mulher a Pilotar um carro de Fórmula 1--- \n" +
                "nome = " + nome + "\n" +
                "idade= " + idade + "\n" +
                "sexo= " + sexo + "\n" +
                "equipe= " + equipe;
    }
}
