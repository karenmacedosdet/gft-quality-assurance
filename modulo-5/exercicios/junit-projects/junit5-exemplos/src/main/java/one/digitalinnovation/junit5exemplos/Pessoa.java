package one.digitalinnovation.junit5exemplos;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDateTime dataNascimento;

    public Pessoa(String nome, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.dataNascimento, LocalDateTime.now());
    }

    public boolean isMaiorDeIdade() {
        return getIdade() >= 18;
    }

}
